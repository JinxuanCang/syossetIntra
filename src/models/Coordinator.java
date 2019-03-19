package models;

import java.util.ArrayList;

public class Coordinator extends Staff {
	private ArrayList<Department> department;
	private String coordinatorTitle;

	public Coordinator() {
		super();
	}

	public ArrayList<Department> getDepartment() {
		return department;
	}

	public void setDepartment(ArrayList<Department> department) {
		this.department = department;
	}
	
	public String getCoordinatorTitle() {
		return coordinatorTitle;
	}

	public void setCoordinatorTitle(String coordinatorTitle) {
		this.coordinatorTitle = coordinatorTitle;
	}
}
