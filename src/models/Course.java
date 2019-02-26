package models;

import java.util.ArrayList;

public class Course {
	int id;
	int college_id;
	String name;
	//CourseType type
	int [] grades;
	int year_length;
	boolean isAlternating;
	int credits; // multiplied by 10
	int college_credits;
	int period_length;
	
	// can use course id arrays as references if slow or too much memory
	ArrayList<Course> prerequisites;
	ArrayList<Course> recommended_prerequisites;
	ArrayList<Course> required_for;
	ArrayList<Course> recommeded_for;
	
	String course_link; // can be URL possibly or link enabled in HTML
	//expenses?
	String description;
	String extra_info;
}
