package home.h_gyula.etelrecept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import home.h_gyula.etelrecept.entity.User;
import home.h_gyula.etelrecept.service.UserService;

@Controller
public class UserRegisterController {
	@Autowired
	UserService us;
	
	@GetMapping(value = "register")
	public String view(Model model) {
		return "user_register";
	}
	@PostMapping(value = "registration")
	public String saveUser(User user, String nev, String password, String password2, Model model) {
		List<User> existingUser=us.existingUser(nev);
		if(password.equals(password2)&&existingUser.size()==0) {
			us.saveUser(user);
			return "redirect:like";
		}
		if(existingUser.size()>0) {
			model.addAttribute("message", "A felhasználónév már foglalt.");
		} else if(!(password.equals(password2))) {
			model.addAttribute("message", "A jelszó nem egyezik.");
		}
		return "user_register";
	}
}
