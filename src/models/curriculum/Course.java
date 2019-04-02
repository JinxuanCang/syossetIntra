package models.curriculum;

import java.util.List;

public class Course {
	private int id;
	private int collegeID;

	private String name;
	private String description;

	private Type type;
	private PeriodType periodType;
	private List<Integer> grades;

	private int credits;
	private int collegeCredits;

	private String recommendedFor;

	private List<Integer> prerequisites;
	private List<Integer> corequisites;
	private List<Integer> requiredCourses;

	private String expenses;

	private String link;
	/*
	 * private List<APTest> apTest; private List<SATSubjectTest> satSubjectTest;
	 */
	private String note;

	public enum Type {
		REGULAR, HONORS, AP, SUPA, LAB, ELECTIVE;
	}

	public enum PeriodType {
		YEAR, ALTERNATING, FALL, SPRING;
	}

	/*
	 * public enum APTest {
	 * 
	 * }
	 * 
	 * public enum SATSubjectTest {
	 * 
	 * }
	 */
}