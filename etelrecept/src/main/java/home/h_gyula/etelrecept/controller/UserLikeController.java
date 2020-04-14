package home.h_gyula.etelrecept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import home.h_gyula.etelrecept.entity.Recept;
import home.h_gyula.etelrecept.entity.User;
import home.h_gyula.etelrecept.service.ReceptService;
import home.h_gyula.etelrecept.service.UserService;

@Controller
public class UserLikeController {
	
	@Autowired
	UserService us;
	
	@Autowired
	ReceptService rs;
	
	@GetMapping(value = "like")
	public String view(Model model) {
		List<User> allUsers= us.allUsers();
		List<Recept> allRecepts=rs.allRecepts();
		model.addAttribute("osszesUser", allUsers);
		model.addAttribute("osszesRecept", allRecepts);
		return "user_recept_like";
	}
	@PostMapping(value = "receptlike_rogzit")
	public String userLikesRecept(Integer users_id, Integer receptek_id) {
		us.userLikesRecept(users_id, receptek_id);
		return "redirect:users_liked";
	}
}
