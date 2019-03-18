/**
 * 
 */
package testPOJO;

import java.io.Serializable;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;

/**
 * @author jinxu
 *
 */
public final class Person {
	// data fields
	private ObjectId id;
	private String firstName;
	private String lastName;
	private Address address;

	// default constructor
	public Person() {

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

	@Override
	public String toString() {
		return firstName + " " + lastName + "\n" + "Address: " + address.toString();
	}
}
