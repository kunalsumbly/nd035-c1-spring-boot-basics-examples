package com.example.mvc_basics.controller;

import java.time.Instant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvc.model.Cat;

@Controller
public class HomeController {
	
	/*
	 * @RequestMapping("/home") public String getHomePage(Model model) {
	 * //model.addAttribute("welcomeMessage", Instant.now().toString()); //String []
	 * greetings = {"hi", "there", "kunal"}; //model.addAttribute("greetings",
	 * greetings); model.addAttribute("msg", "goodbye"); Cat myCat = new Cat("KUSU",
	 * "red", 10); model.addAttribute("cat", myCat); return "home"; }
	 */
    
    @RequestMapping(value="/simplehome")
    public String getGreetings(@RequestParam(value="firstVisit", required = false) String firstVisit,Model model) {
    	model.addAttribute("firstVisit", !"Visit me".equals(firstVisit));
    	return "home";
    }

}
