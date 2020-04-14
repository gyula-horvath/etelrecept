package home.h_gyula.etelrecept.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.h_gyula.etelrecept.entity.Hozzavalo;
import home.h_gyula.etelrecept.entity.Recept;
import home.h_gyula.etelrecept.repository.HozzavalokRepository;
import home.h_gyula.etelrecept.repository.ReceptRepository;

@Service
public class HozzavalokService {
	@Autowired
	HozzavalokRepository hr;

	@Autowired
	ReceptRepository rr;

	public void saveHozzavalo(String[] nev, String[] mennyiseg, String[] mertekegyseg, Integer id) {
		Recept recept = rr.getOne(id);
		for (int i = 0; i < nev.length; i++) {
			Hozzavalo hozzavalo=new Hozzavalo();
			hozzavalo.setNev(nev[i]);
			hozzavalo.setMennyiseg(mennyiseg[i]);
			hozzavalo.setMertekegyseg(mertekegyseg[i]);
			System.out.println(hozzavalo.toString());
			hozzavalo.getReceptek().add(recept);
			recept.getHozzavalok().add(hozzavalo);
			hr.save(hozzavalo);
		}
		rr.save(recept);
	}
}
