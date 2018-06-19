package main.java.spring.inv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RequestMapping(value="Web")
@Controller
public class WebController {
	@RequestMapping(value="Index",method=RequestMethod.GET)
	public String HelloWorld(ModelMap map){
		map.addAttribute("name", "SS");
		map.addAttribute("Bool", true);
		return "HelloWorld";
	}
	

}
