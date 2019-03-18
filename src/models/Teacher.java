package models;

import java.util.ArrayList;

public class Teacher extends Staff {
	private ArrayList<Course> courses;
	private ArrayList<Department> departments;

	public Teacher() {
		super();
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}
}
