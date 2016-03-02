package com.CoffeeShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	@RequestMapping("/cart")
	public ModelAndView helloWorld(@RequestParam("c_name")String c_name,@RequestParam("c_size")String c_size,@RequestParam("options")String options) {
		
		return new ModelAndView("cart","message","");
	}

}
