package models.curriculum;

import java.awt.Image;
import java.util.List;

public class Department {
	private int id;

	private String name;
	private String description;
	private boolean isSpecialProgram;

	private List<Integer> subDepartments;
	private List<CourseList> courseLists;

	private List<Integer> coordinators;
	private List<Integer> teachers;

	private Image sequence;
}