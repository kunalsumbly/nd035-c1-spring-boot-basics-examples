package com.example.mvc_basics.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	/*
	 * @RequestMapping("/home") public String getHomePage(Model model) {
	 * //model.addAttribute("welcomeMessage", Instant.now().toString()); //String []
	 * greetings = {"hi", "there", "kunal"}; //model.addAttribute("greetings",
	 * greetings); model.addAttribute("msg", "goodbye"); Cat myCat = new Cat("KUSU",
	 * "red", 10); model.addAttribute("cat", myCat); return "home"; }
	 */
    
    @RequestMapping(value="/simplehome1")
    public String getGreetings(@RequestParam(value="firstVisit", required = false) String firstVisit,Model model) {
    	model.addAttribute("firstVisit", !"Visit me".equals(firstVisit));
    	return "home";
    }

    @RequestMapping(value="/simplehome")
    public String simpleHome(Model model, HttpServletRequest request) {
    	String parameter = request.getParameter("firstVisit");
    	model.addAttribute("firstVisit", parameter == null);
    	return "home";
    }
}
