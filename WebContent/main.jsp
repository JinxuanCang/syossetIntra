<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Syosset Intranet</title>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width">
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet"
			href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
			integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
			crossorigin="anonymous">
		<style>
			
		</style>
	</head>
	<body>
		<div id="page_main">
			<div id="main_topBar">
				<div id="topBar_logo">Syosset Intranet</div>
				<div>
					<i class="fas fa-search"></i> <input type="text"
						placeholder="Search Intranet"
						style="outline: none; border: none; border-bottom: 2px solid lightgray; height: 20px; width: 250px; font-size: 15px; padding: 4px;" />
				</div>
				<div>Help</div>
				<div>About</div>
				<div style="margin: 200px"></div>
				<div>10.120.32</div>
			</div>
			<div id="main_leftBar">
				<div id="leftBar_pers">
					<div></div>
					<div></div>
					<div></div>
				</div>
				<ul>
					<li class="list-tag">General</li>
					<li>Home/MasterCal</li>
					<li>Cirriculum Manual</li>
					<li>Academic Planner</li>
					<li>Grade Calculator</li>
				</ul>
				<ul>
					<li class="list-tag">Settings</li>
					<li>Account</li>
					<li>Notification</li>
					<li>Permissions</li>
				</ul>
			</div>
			<div id="main_content">
				<iframe name="displayArea" src="grader.html"></iframe>
			</div>
		</div>
	</body>
</html>