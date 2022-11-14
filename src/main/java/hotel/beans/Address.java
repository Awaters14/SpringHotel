package hotel.beans;

import javax.persistence.Embeddable;
import lombok.Data;

/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Oct 16, 2022  
*/
@Embeddable
@Data
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
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", rating=" + rating + "]";
	}
	
	
	
}
