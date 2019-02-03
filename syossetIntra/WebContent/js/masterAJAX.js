function ajax(settings) {
	//timing function
    var time = new Date;
    var sendtime = time.getTime();
    var ajax = new XMLHttpRequest();
    ajax.open(settings.method, settings.path, true);
    if (settings.method=="POST") {
        ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
        ajax.send(settings.input);
    }
    else ajax.send();
    ajax.onreadystatechange = function() {
        if (ajax.readyState==4 && ajax.status!=200){
            if (ajax.status==0) {
                //loadMessage("error","No Server connection. System unable to operate normally.", true);
            }
            else{
                //loadMessage("error","XML Http Request failed. Return code: <b>"+ajax.status+" "+ajax.statusText+"</b>.", true);
            }
        }
        if (ajax.readyState==4 && ajax.status==200) {
            var time = new Date;
            var inter_time = time.getTime()-sendtime;
            GLB_AJAX_Interval = ms_s(inter_time);
            console.log("AJAX finished in "+GLB_AJAX_Interval)
            console.log("%c"+"AJAX Success.","color: green;");
            settings.success(ajax.responseText);
        }
    }
}