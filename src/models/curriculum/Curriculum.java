package models.curriculum;

import java.util.List;

import org.bson.types.ObjectId;

import models.ExaminationRequirement;
import models.GraduationRequirement;
import models.Introduction;
import models.Person;
import models.Staff;

public class Curriculum {
	private ObjectId id;

	private String schoolName;
	private int year;
	// private Image cover;
	private String acknowledgements;

	private List<Introduction> introductions;
	private List<GraduationRequirement> graduationRequirements;
	private List<ExaminationRequirement> examinationRequirements;
	private List<Department> departments;
	private List<Course> courses;
	private List<Staff> staff;
	private List<Person> people;

	public Curriculum() {
		super();
	}
}