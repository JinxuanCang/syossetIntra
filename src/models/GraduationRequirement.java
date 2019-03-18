package models;

public class GraduationRequirement {
	private Department department;
	private int credits; // tenfold

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

}
