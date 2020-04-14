package home.h_gyula.etelrecept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import home.h_gyula.etelrecept.entity.Recept;
import home.h_gyula.etelrecept.service.HozzavalokService;
import home.h_gyula.etelrecept.service.ReceptService;

@Controller
public class HozzavalokRogzitController {
	
	@Autowired
	ReceptService rs;
	
	@Autowired
	HozzavalokService hs;
	
	@GetMapping(value = "hozzavalok")
	public String view(@RequestParam Integer id,@RequestParam Integer count, Model model) {
		Recept recept = rs.findSpecificRecept(id);
		model.addAttribute("recept", recept);
		model.addAttribute("counter", count);
		return "hozzavalok_rogzit";
	}
	
	@PostMapping(value = "hozzavalok_rogzit")
	public String saveHozzavalok(String[] nev, String[] mennyiseg, String[] mertekegyseg, Integer id) {
		hs.saveHozzavalo(nev, mennyiseg, mertekegyseg, id);
		return "redirect:like";
	}
}
