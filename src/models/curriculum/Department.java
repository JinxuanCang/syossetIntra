package models;

import java.util.ArrayList;

public class Department {
	private String name;
	private String description;
	private ArrayList<Coordinator> coordinators;
	private ArrayList<Course> courses;
	//Image sequence;?
	private boolean isSpecialProgram;

	public Department() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Coordinator> getCoordinators() {
		return coordinators;
	}

	public void setCoordinators(ArrayList<Coordinator> coordinators) {
		this.coordinators = coordinators;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public boolean isSpecialProgram() {
		return isSpecialProgram;
	}

	public void setSpecialProgram(boolean isSpecialProgram) {
		this.isSpecialProgram = isSpecialProgram;
	}
}
