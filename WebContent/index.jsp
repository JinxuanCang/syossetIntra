<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DataBase Collection Manage</title>
<link rel="stylesheet" type="text/css" href="css/basicStyling.css" />
</head>
<body>
	<div>Current Database is <b>DemoSite</b>.</div>
	<div>Switch to Collection</div>
	<div id="collect_button">
		<select>
			<option>sample0</option>
		</select>
	</div>
	<div id="action_button">
		<button data-button='refresh' onclick="getAllDoc();">Refresh Tbl.</button>
		<button data-button='save' disabled>Save 0 Change(s)</button>
		<label for="autoSave_checkbox">Auto-save</label>
		<input type="checkbox" id="autoSave_checkbox"/>
		<label for="autoSave_countdown">within</label>
		<input type="number" min="3" max="300" id="autoSave_countdown" value="10"/>
		<label for="autoSave_countdown">s</label>
	</div>
	<div><table id="collect_table" class="standardTable"></table></div>
	<div id="change_list"></div>
	<script>
		var tableCont = document.getElementById("collect_table");
		var collectionAJAX = {
			method : "GET",
			path : "./GetCollections",
			success : function(response) {
				var targetEle = document.getElementById("collect_button");
				response = response.replace(/}{/g, "},{");
				var JSONArray = JSON.parse("[" + response + "]");
				for (let i = 0; i < JSONArray.length; i++)
					JSONArray[i]._id = JSONArray[i]._id.$oid;
				console.log(JSONArray);
				makeTable(JSONArray, true, false, document
						.getElementById("collect_table"), Object.keys(JSONArray[0]));
			}
		}
		window.onload = function() {
			
			getAllDoc();
		}
		function getAllDoc() {
			clearTable(tableCont);
			ajax(collectionAJAX);
		}
		function clearTable(specify) {
			while(specify.hasChildNodes())
				specify.firstChild.remove();
		}
		function makeTable(JSONList, rowIndexed, colIndexed, target, colName) {
			if (!rowIndexed) {

			}
			var tableHeader = document.createElement("tr");
			for (let i = 0; i < colName.length; i++) {
				var headerCol = document.createElement("td");
				headerCol.innerHTML = colName[i];
				tableHeader.appendChild(headerCol);
			}
			target.appendChild(tableHeader);
			for (let i = 0; i < JSONList.length; i++) {
				var tableRow = document.createElement("tr");
				if (!colIndexed) {
					var entriesAsArray = Object.entries(JSONList[i]);
					for (let j = 0; j < entriesAsArray.length; j++) {
						var rowColumn = document.createElement("td");
						if (true && j != 0) {
							rowColumn.setAttribute("contentEditable", "true");
							rowColumn
									.setAttribute("onkeyup",
											"validateEditable(this);detectChange(this);");
							rowColumn
							.setAttribute("onkeyup",
									"validateEditable(this);detectChange(this);")
							rowColumn.setAttribute("data-original",
									entriesAsArray[j][1]);
						}

						rowColumn.innerHTML = entriesAsArray[j][1];
						tableRow.appendChild(rowColumn);
					}
				}
				target.appendChild(tableRow);
			}
		}
		function detectChange(element) {
			(function(isChanged) {
				element.classList.toggle("unsavedCell", isChanged);
				var unsavedEntry = document.getElementById("collect_table")
						.querySelectorAll(".unsavedCell:not([data-invalid])");
				var saveButton = document.getElementById("action_button")
						.querySelectorAll("button[data-button='save']")[0];
				saveButton.innerText = "Save " + unsavedEntry.length
						+ " Change(s)";
				saveButton
						.toggleAttribute("disabled", unsavedEntry.length == 0);
			})(element.innerHTML != element.dataset.original);
		}
		function validateEditable(element) {
			var validateTarget = element.innerHTML;
			if (element.tagName.toUpperCase == "INPUT")
				validateTarget = element.value;
			(function(isInvalid) {
				element.classList.toggle("invalidCell", isInvalid);
				element.toggleAttribute("data-invalid", isInvalid);
			})(validateTarget.match(/[^a-zA-Z]/g));

		}
		function ajax(callin) {
			var ajax = new XMLHttpRequest();
			ajax.open(callin.method, callin.path, true);
			if (callin.method == "POST") {
				ajax.setRequestHeader("Content-type",
						"application/x-www-form-urlencoded");
				ajax.send(callin.input);
			} else
				ajax.send();
			ajax.onreadystatechange = function() {
				if (ajax.readyState == 4 && ajax.status == 200) {
					callin.success(ajax.responseText);
				}
			}
		}
	</script>
</body>
</html>