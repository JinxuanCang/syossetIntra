package models.curriculum;

import java.util.List;

public class Department {
	private int id;
	
	private String name;
	private String description;

	private List<Integer> coordinators;
	private List<Integer> courses;
	
	//Image sequence
	private boolean isSpecialProgram;

	public Department() {
		super();
	}
}