package home.h_gyula.etelrecept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import home.h_gyula.etelrecept.entity.Recept;
import home.h_gyula.etelrecept.service.ReceptService;

@Controller
public class ReceptRogzitController {
	@Autowired
	ReceptService rs;
	
	@GetMapping(value = "recept")
	public String view() {
		return "recept_rogzit";
	}
	@PostMapping(value = "recept_rogzit")
	public String saveRecept(Model model, Recept recept, Integer szam) {
		rs.saveRecept(recept);
		return "redirect:hozzavalok?id="+recept.getId()+"&count="+szam;
	}
}
