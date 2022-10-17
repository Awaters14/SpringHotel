package hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import hotel.beans.Address;
import hotel.beans.Hotel;
import hotel.controller.BeanConfiguration;
import hotel.repository.HotelRepository;

@SpringBootApplication
public class SpringHotel2022Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHotel2022Application.class, args);
	}
	
	@Autowired
	HotelRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Hotel h = appContext.getBean("hotel", Hotel.class);
		h.setBeds(1);
		repo.save(h);
		
		Hotel a = new Hotel("Sheep Sleep Hotel", 2, "Queen");
		Address b = new Address("456 NotMain Street", "Super Mario Land", "AL", 1);
		a.setAddress(b);
		repo.save(a);
		
		List<Hotel> allMyHotel = repo.findAll();
		for(Hotel info: allMyHotel) {
			System.out.println(info.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
		
		
	
		
	}
		

}
