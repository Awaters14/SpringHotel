package hotel.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Oct 16, 2022  
*/
@Entity
public class Hotel {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int beds;
	private String size;
	@Autowired
	private Address address;
	/**
	 * @param name
	 */
	public Hotel(String name) {
		super();
		this.name = name;
	}
	/**
	 * 
	 */
	public Hotel() {	
		super();
		this.beds = 1;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param beds
	 * @param size
	 */
	public Hotel(String name, int beds, String size) {
		super();
		this.name = name;
		this.beds = beds;
		this.size = size;
	}
	/**
	 * @param id
	 * @param name
	 * @param beds
	 * @param size
	 */
	public Hotel(long id, String name, int beds, String size) {
		super();
		this.id = id;
		this.name = name;
		this.beds = beds;
		this.size = size;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the beds
	 */
	public int getBeds() {
		return beds;
	}
	/**
	 * @param beds the beds to set
	 */
	public void setBeds(int beds) {
		this.beds = beds;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", beds=" + beds + ", size=" + size + ", address=" + address
				+ "]";
	}
	

}
