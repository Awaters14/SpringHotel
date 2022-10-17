package hotel.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hotel.beans.Address;
import hotel.beans.Hotel;

/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Oct 16, 2022  
*/
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Hotel hotel() {
		Hotel bean = new Hotel("Bake Beans Hotel");
		//bean.setName("Sleep Hotel");
		//bean.setBeds(2);
		//bean.setSize("Queen");
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address("123 Main Street", "Des Moines", "IA", 4);
		return bean;
	}
}
