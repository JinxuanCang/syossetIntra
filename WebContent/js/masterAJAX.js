function ajax(settings) {
	//declare timing variable
	var timestamp = new Date;
	// define ajax object
	var ajax = new XMLHttpRequest();
	// define and get time
	var requestTime = timestamp.getTime();
	var responseTime;
	var reqDuration;

	//ajax object open connection
	ajax.open(settings.method, settings.path, true);

	// if POST, set special request header, send contents
	// else send nothing
	if (settings.method=="POST") {
		ajax.setRequestHeader("Content-type", "multipart/form-data");
		//ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded"); // explicit definition, application/x-www-form-urlencoded as default
		ajax.send(settings.input);
	}
	else
		ajax.send();

	//detect ajax call state change
	ajax.onreadystatechange = function() {
		if (ajax.readyState == 4) {
			if (ajax.status == 200) {
				timestamp = new Date;
				responseTime = (new Date).getTime();
				reqDuration = timestamp.getTime()-requestTime;
				console.log("%c"+"AJAX finished in " + convApp(reqDuration),"color: green;");
				settings.success(ajax.responseText);
			}
			else {
				if(ajax.status == 0) console.error("No sever connection.");
			}
		}
	}
	
	// helper functions
	// convert milliseconds to x/1000+"s" or x+"ms"
	function convApp(value) {
		if (value>1000) {
			value /= 1000;value += "s";
		}
		else
			value += "ms";
		return value;
	}
}
