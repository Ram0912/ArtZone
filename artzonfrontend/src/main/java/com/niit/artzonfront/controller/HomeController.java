package com.niit.artzonfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String gotohome(){
		return "index";
	}
@RequestMapping("/login")
public String login(Model model)
{
	model.addAttribute("userClickedlogin","true");
	return "index";
	
}
@RequestMapping("/register")
public String register(Model model)
{
	model.addAttribute("userClickedregister","true");
	return "index";
}


@RequestMapping("/addtocart")
public String addtocart(Model model)
{
	model.addAttribute("userClickedaddtocart","true");
	
	return "add to cart";
	
}

}


