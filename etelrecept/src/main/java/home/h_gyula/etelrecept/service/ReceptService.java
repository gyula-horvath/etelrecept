package home.h_gyula.etelrecept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.h_gyula.etelrecept.entity.Recept;
import home.h_gyula.etelrecept.repository.ReceptRepository;

@Service
public class ReceptService {
	@Autowired
	ReceptRepository rr;
	
	public void saveRecept(Recept recept) {
		rr.save(recept);
	}
	
	public List<Recept> allRecepts() {
		return rr.findAll();
	}
	
	public Recept findSpecificRecept(Integer id) {
		return rr.getOne(id);
	}
}
