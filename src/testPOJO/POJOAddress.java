/**
 * 
 */
package testPOJO;

/**
 * @author jinxu
 *
 */
public class POJOAddress {
	private String number;
	private String street;
	private String city;
	private String state;
	private String zip;
	//default constructor
	protected POJOAddress() {
		
	}
	protected POJOAddress(final String number, final String street, final String city, final String state, final String zip) {
		setNumber(number);
		setStreet(street);
		setCity(city);
		setState(state);
		setZip(zip);
	}
	//seters
	protected void setNumber(final String number) {
		this.number = number;
	}
	protected void setStreet(final String street) {
		this.street = street;
	}
	protected void setCity(final String city) {
		this.city = city;
	}
	protected void setState(final String state) {
		this.state = state;
	}
	protected void setZip(final String zip) {
		this.zip = zip;
	}
	//geters
	protected String getNumber() {
		return number;
	}
	protected String getStreet() {
		return street;
	}
	protected String getCity() {
		return city;
	}
	protected String getState() {
		return state;
	}
	protected String getZip() {
		return zip;
	}
}
