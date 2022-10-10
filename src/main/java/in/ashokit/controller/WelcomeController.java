package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome(Model model)
	{
		System.out.println("This is welcome() method");
		model.addAttribute("msg", "Welcome to Spring Boot..!!");
		return "index";
	}
	
}
