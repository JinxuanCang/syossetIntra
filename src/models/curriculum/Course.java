package models.curriculum;

import java.util.List;

import models.SubjectTests;

public class Course {
	private int id;
	
	private int courseID;
	private int collegeID;
	
	private String name;
	
	private Type type;
	private List<Integer> grades;
	private YearLength yearLength;
	
	private int credits;
	private int collegeCredits;
	
	private String recommendedFor;

	private List<Integer> prerequisites;
	private List<Integer> corequisites;
	private List<Integer> required;
	
	private String expenses;

	private String courseLink;
	private String description;
	private String extra_info;
	private List<SubjectTests> subjectTests;

	public Course() {
		super();
	}
	
	public enum Type {
		REGULAR, HONORS, AP, SUPA, LAB, ELECTIVE;
	}
	
	public enum YearLength {
		YEAR, FALL, SPRING;
	}
	
	public enum PeriodType {
		REGULAR, ALTERNATING
	}
}
