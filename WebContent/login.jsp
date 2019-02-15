<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login - Syo Intranet</title>
<link rel="stylesheet" type="text/css" href="css/login.css" />
<!-- import masterAJAX.js -->
<script src="js/masterAJAX.js"></script>
<script src="js/sha1.js"></script>
</head>
<body>
	<div id="body_main">
		<img></img>
		<h4>Syosset Intranet Project</h4>
		<div id="main_login">
			<label>Name</label>
			<input type="text" id="login_username"></input>
			<label>Password</label>
			<input type="password" id="login_password"></input>
			<button id="login_submit">Login</button>
		</div>
	</div>
	<script>
		// decalre vairables
		var logAJAX; //XMLHttpRequest
		// target input fields
		var logUsr = document.getElementById("login_username");
		var logPwd = document.getElementById("login_password");
		// target submission button
		var logSubmit = document.getElementById("login_submit");
		
		
		var dataField = new FormData();
		
		logUsr.addEventListener("input", validateEle(this), false);
		logPwd.addEventListener("input", validateEle(this), false);
		
		function validateEle(element) {
			// TODO validate passed element
			// [objectives] 1. append class "invalid" to the element if contains value other than standard ASCII values.
		}
		logSubmit.onclick = function() {
			// TODO check both username and password before sending
			dataField.set("username", logUsr.value);
			dataField.set("password", sha1(logPwd.value));
			var AJAXsets = {
					input: dataField,
					path: "login",
					method: "POST",
					success: function(response) {
						console.log(response);
					}
			}
			ajax(AJAXsets);
		}
		

	</script>
</body>
</html>