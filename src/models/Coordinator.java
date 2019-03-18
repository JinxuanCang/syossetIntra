package models;

import java.util.ArrayList;

public class Coordinator extends Staff {
	private ArrayList<Department> department;

	public Coordinator() {
		super();
	}

	public ArrayList<Department> getDepartment() {
		return department;
	}

	public void setDepartment(ArrayList<Department> department) {
		this.department = department;
	}
}
