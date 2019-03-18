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
		<!--
		Grader Schematic
			div.grader
				PORTION.left
					
				PORTION.right

		-->
		<h2>Grader.html</h2>
		<div id="grader" style="">
			<div data-portion="left">
				<div id="grader_header">
					<div><button>Save</button></div>
					<div>%</div>
					<div>Category</div>
					<div>Weight</div>
					<div>Total Pts.</div>
				</div>
				<div>
					<div class="grade_course" data-courseName="APChem">
						<div class="course_name" contenteditable>AP Chemistry</div>
						<div class="grade_category">
							<div class="number-cell">70</div>
							<div contenteditable>Tests/Quizzes</div>
							<div class="cate_weight number-cell" contenteditable>70.0</div>
							<div>Pts. Poss</div>
							<div class="category_total number-cell">100</div>
							<div>Recei.</div>
							<div class="category_rec number-cell">90</div>
							<div>Perc.</div>
							<div class="category_perct number-cell">90</div>
						</div>
						<div class="grade_category">
							<div class="number-cell">10</div>
							<div contenteditable>Partic.</div>
							<div class="cate_weight number-cell" contenteditable>10.0</div>
							<div>Pts. Poss</div>
							<div class="category_total number-cell">200</div>
							<div>Recei.</div>
							<div class="category_rec number-cell">200</div>
							<div>Perc.</div>
							<div class="category_perct number-cell">100</div>
						</div>
						<div class="grade_category">
							<div class="number-cell">20</div>
							<div contenteditable>HW/CW</div>
							<div class="cate_weight number-cell" contenteditable>20.0</div>
							<div>Pts. Poss</div>
							<div class="category_total number-cell">200</div>
							<div>Recei.</div>
							<div class="category_rec number-cell">100</div>
							<div>Perc.</div>
							<div class="category_perct number-cell">50</div>
						</div>
					</div>
				</div>
			</div>
			<div data-portion="right">
				<div class="grader_header">
					<div><button>Save</button></div>
					<div>%</div>
					<div>Category</div>
					<div>Weight</div>
					<div>Total Pts.</div>
				</div>
			</div>
		</div>
	</body>
</html>