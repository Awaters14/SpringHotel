package hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel.beans.Hotel;
/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Oct 16, 2022  
*/
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

	
}
