package models;

import java.util.ArrayList;

public class Department {
	String name;
	String description;
	ArrayList<Coordinator> coordinators;
	ArrayList<Course> courses;
	//Image sequence;?
	boolean isSpecialProgram;
}
