package br.estacio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	
@RequestMapping("/registerForm")
public String home(){
	return "registerForm";
	
}


}
