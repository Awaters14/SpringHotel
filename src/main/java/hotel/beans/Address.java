package hotel.beans;

import javax.persistence.Embeddable;

/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Oct 16, 2022  
*/
@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;
	private int rating;
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param rating
	 */
	public Address(String street, String city, String state, int rating) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.rating = rating;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", rating=" + rating + "]";
	}
	
	
	
}
