package models;

import java.util.ArrayList;

import models.curriculum.Course;

public class ExaminationRequirement {
	private String name;
	private ArrayList<Course> courses;
	private int minimumTestGrade;

	public ExaminationRequirement() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public int getMinimumTestGrade() {
		return minimumTestGrade;
	}

	public void setMinimumTestGrade(int minimumTestGrade) {
		this.minimumTestGrade = minimumTestGrade;
	}

}
