package home.h_gyula.etelrecept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
	
	@GetMapping(value = "error")
	public String errorpage() {
		return "error";
	}
}
