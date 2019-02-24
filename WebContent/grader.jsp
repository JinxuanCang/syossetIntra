<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Grade Calculator</title>
		<link href="css/grader.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<h2>Grader.html</h2>
		<div id="grader" style="">
			<div id="grader_header">
				<div>%</div>
				<div>Category</div>
				<div>Weight</div>
				<div>Total Pts.</div>
			</div>
			<div class="grade_course" data-courseName="APChem">
				<div class="grade_category">
					<div>63</div>
					<div>Tests/Quizzes</div>
					<div class="cate_weight" contenteditable>70.0</div>
					<div>Pts. Poss</div>
					<div class="category_total">100</div>
					<div>Recei.</div>
					<div class="category_rec">90</div>
					<div>Perc.</div>
					<div class="category_perct">90</div>
				</div>
				<div class="grade_category">
					<div>10</div>
					<div>Partic.</div>
					<div class="cate_weight" contenteditable>30.0</div>
					<div>Pts. Poss</div>
					<div class="category_total">200</div>
					<div>Recei.</div>
					<div class="category_rec">200</div>
					<div>Perc.</div>
					<div class="category_perct">100</div>
				</div>
			</div>
		</div>
	</body>
</html>