/**
 * 
 */
package testPOJO;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import models.curriculum.Course;
import models.curriculum.Curriculum;
import models.curriculum.Department;

/**
 * @author jinxu
 *
 */
public class Person {
	// data fields
	private ObjectId id;
	private String firstName;
	private String lastName;
	private Address address;
	private List<Subject> subjects;
	
	// default constructor
	public Person() {
		super();
	}

	public Person(final String firstName, final String lastName, final Address address) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
	}

	// setters
	public void setObjectId(final ObjectId id) {
		this.id = id;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(final Address address) {
		this.address = address;
	}

	// getters
	public ObjectId getObjectId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}

	/**
	 * @return the subjects
	 */
	public List<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + "\n" + "Address: " + address.toString() + "\nGrades: " + subjects.toString();
	}
}
