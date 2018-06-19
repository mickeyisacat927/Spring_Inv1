package main.java.spring.inv1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.java.spring.inv1.model.Person;
@RequestMapping(value="Rest")
@RestController
public class RestfulController {
	
	@RequestMapping(value="getHelloWorld", method=RequestMethod.GET)
	public Object HelloWorld1(String search){
	
		return search;
	}
	@RequestMapping(value="postHelloWorld", method=RequestMethod.POST)
	public Object HelloWorld2(@RequestBody Person person){
		person.setAge(person.getAge()+10);
		return person;
	}
}
