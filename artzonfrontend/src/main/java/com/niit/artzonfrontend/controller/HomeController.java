package com.niit.artzonfrontend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.zonbackend.dao.RegisterServiceDAO;
import com.niit.zonbackend.model.Register;

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


