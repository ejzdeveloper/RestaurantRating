package co.grandcircus.RestaurantRating;

import java.util.Collections;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class RestaurantRatingController {

	@Autowired
	private RestaurantDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("restaurant", dao.sortRating());
		return mv;	
	}
	
	@RequestMapping("/rating")
	public ModelAndView sortByRating() {
		return new ModelAndView("index", "restaurant", dao.sortRating());		
	}
	
	@RequestMapping("/name")
	public ModelAndView sortByName() {
		return new ModelAndView("index", "restaurant", dao.sortName());		
	}
	
//	@RequestMapping("/vote")
//	public ModelAndView vote() {
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("restaurant", dao.findAll());
//		return mv;	
//	}

	// same URL but different method
//	@PostMapping("/vote")
//	public ModelAndView postVote(@RequestParam("id") Long id) {
//		ModelAndView mav = new ModelAndView("index");
//		dao.findById(id).setRating(dao.findById(id).getRating()+1);
//		dao.update(dao.findById(id));
//		mav.addObject("restaurant", dao.findById(id));
//		return mav;
//	}
	
	
}
