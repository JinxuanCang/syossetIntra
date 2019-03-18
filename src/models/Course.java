package models;

import java.util.ArrayList;

public class Course {
	private int id;
	private int college_id;
	private String name;
	// private CourseType type
	private int[] grades;
	private int year_length;
	private boolean isAlternating;
	private int credits; // multiplied by 10
	private int college_credits;
	private int period_length;

	// can use course id arrays as references if slow or too much memory
	private ArrayList<Course> prerequisites;
	private ArrayList<Course> recommended_prerequisites;
	private ArrayList<Course> required_for;
	private ArrayList<Course> recommeded_for;

	private String course_link; // can be URL possibly or link enabled in HTML
	// expenses?
	private String description;
	private String extra_info;

	public Course() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCollege_id() {
		return college_id;
	}

	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public int getYear_length() {
		return year_length;
	}

	public void setYear_length(int year_length) {
		this.year_length = year_length;
	}

	public boolean isAlternating() {
		return isAlternating;
	}

	public void setAlternating(boolean isAlternating) {
		this.isAlternating = isAlternating;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCollege_credits() {
		return college_credits;
	}

	public void setCollege_credits(int college_credits) {
		this.college_credits = college_credits;
	}

	public int getPeriod_length() {
		return period_length;
	}

	public void setPeriod_length(int period_length) {
		this.period_length = period_length;
	}

	public ArrayList<Course> getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(ArrayList<Course> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public ArrayList<Course> getRecommended_prerequisites() {
		return recommended_prerequisites;
	}

	public void setRecommended_prerequisites(ArrayList<Course> recommended_prerequisites) {
		this.recommended_prerequisites = recommended_prerequisites;
	}

	public ArrayList<Course> getRequired_for() {
		return required_for;
	}

	public void setRequired_for(ArrayList<Course> required_for) {
		this.required_for = required_for;
	}

	public ArrayList<Course> getRecommeded_for() {
		return recommeded_for;
	}

	public void setRecommeded_for(ArrayList<Course> recommeded_for) {
		this.recommeded_for = recommeded_for;
	}

	public String getCourse_link() {
		return course_link;
	}

	public void setCourse_link(String course_link) {
		this.course_link = course_link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtra_info() {
		return extra_info;
	}

	public void setExtra_info(String extra_info) {
		this.extra_info = extra_info;
	}

}
