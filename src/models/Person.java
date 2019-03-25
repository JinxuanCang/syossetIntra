package models;

import org.bson.types.ObjectId;

public class Person {
	private ObjectId id;
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String title; // Dr.

	public Person() {
		//super(); //? This class does not extend any other class.
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	private String phoneNumber;
//	private String email;
}
