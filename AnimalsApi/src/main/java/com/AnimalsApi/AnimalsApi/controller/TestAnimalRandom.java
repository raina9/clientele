package com.AnimalsApi.AnimalsApi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController 
public class TestAnimalRandom {

	String[] array={"dog","lion","otter","cat","platypus","cow","sheep","guinea pig","llama","goat","pig","turkey","chicken","rabbit"}; 
	//List<String> var= Arrays.asList(array);
	
	
	
	@GetMapping("/")
	public ModelAndView viewRandomAnimal() {
				ModelAndView mv = new ModelAndView();
				mv.setViewName("index");
				return mv;	
	}
	
	@GetMapping("/showanimal")
	public ModelAndView showAnimals(HttpServletRequest request) {
		
		 String randomname = array[new Random().nextInt(array.length)];
		 String url = request.getRequestURL().toString().replaceAll("showanimal", randomname)+".jpg";
		ModelAndView mv1 = new ModelAndView();
		mv1.setViewName("index");
		mv1.addObject("AnimalName", randomname);
		mv1.addObject("imageurl",url);
		mv1.addObject("hide",true);
		return mv1;
		
	}
	
}
