<<<<<<< HEAD
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
=======
package models;

import java.util.ArrayList;

public class Curriculum {
	private int year;
	// private Image cover;
	private String schoolName;
	private String departmentHeader;
	private String specialProgramHeader;
	private String guidanceCounselorHeader;
	private String acknowledgements;
	private String approvalBox;
	
	private ArrayList<Introduction> introductions;
	private ArrayList<GraduationRequirement> graduationRequirements;
	private ArrayList<ExaminationRequirement> examinationRequirements;
	private ArrayList<Department> departments;
	private ArrayList<Course> courses;
	private ArrayList<Person> people;

	public Curriculum() {
		super();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDepartmentHeader() {
		return departmentHeader;
	}

	public void setDepartmentHeader(String departmentHeader) {
		this.departmentHeader = departmentHeader;
	}

	public String getSpecialProgramHeader() {
		return specialProgramHeader;
	}

	public void setSpecialProgramHeader(String specialProgramHeader) {
		this.specialProgramHeader = specialProgramHeader;
	}

	public String getGuidanceCounselorHeader() {
		return guidanceCounselorHeader;
	}

	public void setGuidanceCounselorHeader(String guidanceCounselorHeader) {
		this.guidanceCounselorHeader = guidanceCounselorHeader;
	}

	public ArrayList<Introduction> getIntroductions() {
		return introductions;
	}

	public void setIntroductions(ArrayList<Introduction> introductions) {
		this.introductions = introductions;
	}

	public ArrayList<GraduationRequirement> getGraduationRequirements() {
		return graduationRequirements;
	}

	public void setGraduationRequirements(ArrayList<GraduationRequirement> graduationRequirements) {
		this.graduationRequirements = graduationRequirements;
	}

	public ArrayList<ExaminationRequirement> getExaminationRequirements() {
		return examinationRequirements;
	}

	public void setExaminationRequirements(ArrayList<ExaminationRequirement> examinationRequirements) {
		this.examinationRequirements = examinationRequirements;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}

>>>>>>> branch 'master' of https://github.com/JinxuanCang/syossetIntra.git
}