package br.com.samuel.jogomemoria.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView menu(){
		 
		   return new ModelAndView("menu");
	}
	@RequestMapping("/index")
	public ModelAndView index(){
		 
		   return new ModelAndView("index");
	}
	@RequestMapping("/score")
	public ModelAndView score(){
		 
		   return new ModelAndView("score");
	}
       
}
	 
