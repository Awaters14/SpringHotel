package hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import hotel.beans.Hotel;
import hotel.repository.HotelRepository;

/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Oct 31, 2022  
*/
@Controller
public class WebController {
	
	@Autowired
	HotelRepository repo;

	@GetMapping({"/", "/viewAll"})
		public String viewAllHotels(Model model) {
			if(repo.findAll().isEmpty()) {
				return addNewHotel(model);
			}
		model.addAttribute("hotels", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputHotel")
	public String addNewHotel(Model model) {
		Hotel h = new Hotel();
		model.addAttribute("newHotel", h);
		return "input";
	}
	
	@PostMapping("/inputHotel")
	public String addNewHotel(@ModelAttribute Hotel h, Model model) {
		repo.save(h);
		return viewAllHotels(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateHotel(@PathVariable("id") long id, Model model) {
		Hotel h = repo.findById(id).orElse(null);
		model.addAttribute("newHotel", h);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseHotel(Hotel h, Model model) {
		repo.save(h);
		return viewAllHotels(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Hotel c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllHotels(model);
	}
	
	
}
