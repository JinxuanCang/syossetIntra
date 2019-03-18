/**
 * 
 */
package testPOJO;

import org.bson.types.ObjectId;

/**
 * @author jinxu
 *
 */
public class POJOPerson {
	//data fields
	private ObjectId id;
	private String firstName;
	private String lastName;
	private POJOAddress address;
	//default constructor
	protected POJOPerson() {
		
	}
	protected POJOPerson(final String firstName, final String lastName, final POJOAddress address) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
	}
	//seters
	protected void setObjectId(final ObjectId id) {
		this.id = id;
	}
	protected void setFirstName(final String firstName) {
		this.firstName = firstName; 
	}
	protected void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	protected void setAddress(final POJOAddress address) {
		this.address = address;
	}
	//getters
	protected ObjectId getObjectId() {
		return id;
	}
	protected String getFirstName() {
		return firstName;
	}
	protected String getLastName() {
		return lastName;
	}
	protected POJOAddress getAddress() {
		return address;
	}
}
