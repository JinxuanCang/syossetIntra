package models;

import java.util.ArrayList;

public class Curriculum {
	private int year;
	private ArrayList<Introduction> introductions;
	private ArrayList<GraduationRequirement> graduationRequirements;
	private ArrayList<ExaminationRequirement> examinationRequirements;
	private ArrayList<Department> departments;
	private ArrayList<Person> people;

	public Curriculum() {
		super();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ArrayList<Introduction> getIntroductions() {
		return introductions;
	}

	public void setIntroductions(ArrayList<Introduction> introductions) {
		this.introductions = introductions;
	}

	public ArrayList<GraduationRequirement> getGraduationRequirements() {
		return graduationRequirements;
	}

	public void setGraduationRequirements(ArrayList<GraduationRequirement> graduationRequirements) {
		this.graduationRequirements = graduationRequirements;
	}

	public ArrayList<ExaminationRequirement> getExaminationRequirements() {
		return examinationRequirements;
	}

	public void setExaminationRequirements(ArrayList<ExaminationRequirement> examinationRequirements) {
		this.examinationRequirements = examinationRequirements;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}

}