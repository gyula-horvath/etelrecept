package home.h_gyula.etelrecept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import home.h_gyula.etelrecept.entity.User;
import home.h_gyula.etelrecept.service.UserService;

@Controller
public class UserLikeListController {
	@Autowired
	UserService us;
	
	@GetMapping("users_liked")
	public String view(Model model) {
		List<User> osszesUser=us.allUsers();
		model.addAttribute("osszesUser", osszesUser);
		return "likelista";
	}
	
}
