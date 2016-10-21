package com.niit.shoppingcart.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
@RequestMapping("/validate")
public String validate(@RequestParam(name="userID")String id, @RequestParam(name="password")String pwd, Model model)
{
if (id.equals("ram") &&pwd.equals("ram"))
{
	model.addAttribute("Success", "You logged in Successfully");
	return "index";
	
}else{
	model.addAttribute("Error", "Invalid User" );
	return "index";
	
}

}
}

