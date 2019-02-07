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
		//ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
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
				GLB_AJAX_Interval = (reqDuration);//ms_s undefined function
				console.log("AJAX finished in "+GLB_AJAX_Interval)
				console.log("%c"+"AJAX Success.","color: green;");
				settings.success(ajax.responseText);
			}
			else {
				if (ajax.status == 0) {
					//loadMessage("error","No Server connection. System unable to operate normally.", true);
				}
				else {
					//loadMessage("error","XML Http Request failed. Return code: <b>"+ajax.status+" "+ajax.statusText+"</b>.", true);
				}
			}
		}
	}
}
