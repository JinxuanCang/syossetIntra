package models;

import models.curriculum.Department;

public class GraduationRequirement {
	private Department department; // needs to be subject
	private int credits; // tenfold
	private boolean advanced;

	public GraduationRequirement() {
		super();
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public boolean isAdvanced() {
		return advanced;
	}

	public void setAdvanced(boolean advanced) {
		this.advanced = advanced;
	}

}
