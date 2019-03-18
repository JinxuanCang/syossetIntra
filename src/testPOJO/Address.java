/**
 * 
 */
package testPOJO;

import java.io.Serializable;

import com.mongodb.BasicDBObject;

/**
 * @author jinxu
 *
 */
public final class Address {
	private String number;
	private String street;
	private String city;
	private String state;
	private String zip;

	// default constructor
	public Address() {

	}

	public Address(final String number, final String street, final String city, final String state, final String zip) {
		setNumber(number);
		setStreet(street);
		setCity(city);
		setState(state);
		setZip(zip);
	}

	// seters
	public void setNumber(final String number) {
		this.number = number;
	}

	public void setStreet(final String street) {
		this.street = street;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public void setState(final String state) {
		this.state = state;
	}

	public void setZip(final String zip) {
		this.zip = zip;
	}

	// geters
	public String getNumber() {
		return number;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	@Override
	public String toString() {
		return number + " " + street + ", " + city + ", " + state + ", " + zip;
	}
}
