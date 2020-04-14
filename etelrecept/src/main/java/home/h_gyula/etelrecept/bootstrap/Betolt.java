package home.h_gyula.etelrecept.bootstrap;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import home.h_gyula.etelrecept.entity.Hozzavalo;
import home.h_gyula.etelrecept.entity.Recept;
import home.h_gyula.etelrecept.entity.User;
import home.h_gyula.etelrecept.repository.ReceptRepository;
import home.h_gyula.etelrecept.repository.UserRepository;

@Component
public class Betolt implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	ReceptRepository rr;
	
	@Autowired
	UserRepository ur;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Recept paradicsomleves=new Recept();
		paradicsomleves.setNev("paradicsomleves");
		paradicsomleves.setNehezseg("konnyu");
		
		Hozzavalo cukor = new Hozzavalo();
		cukor.setNev("cukor");
		cukor.setMennyiseg("10");
		cukor.setMertekegyseg("g");
		cukor.getReceptek().add(paradicsomleves);
		paradicsomleves.getHozzavalok().add(cukor);
		
		Hozzavalo paradicsom = new Hozzavalo();
		paradicsom.setNev("bors");
		paradicsom.setMennyiseg("10");
		paradicsom.setMertekegyseg("g");
		paradicsom.getReceptek().add(paradicsomleves);
		paradicsomleves.getHozzavalok().add(paradicsom);
		
		Hozzavalo viz = new Hozzavalo();
		viz.setNev("viz");
		viz.setMennyiseg("500");
		viz.setMertekegyseg("g");
		viz.getReceptek().add(paradicsomleves);
		paradicsomleves.getHozzavalok().add(viz);
		
		rr.save(paradicsomleves);
		
		Recept gulyas=new Recept();
		gulyas.setNev("Gulyas");
		gulyas.setNehezseg("kozepes");
		
		Hozzavalo so = new Hozzavalo();
		so.setNev("so");
		so.setMennyiseg("10");
		so.setMertekegyseg("g");
		so.getReceptek().add(gulyas);
		gulyas.getHozzavalok().add(so);
		
		Hozzavalo bors = new Hozzavalo();
		bors.setNev("bors");
		bors.setMennyiseg("10");
		bors.setMertekegyseg("g");
		bors.getReceptek().add(gulyas);
		gulyas.getHozzavalok().add(bors);
		
		Hozzavalo krumpli = new Hozzavalo();
		krumpli.setNev("krumpli");
		krumpli.setMennyiseg("500");
		krumpli.setMertekegyseg("g");
		krumpli.getReceptek().add(gulyas);
		gulyas.getHozzavalok().add(krumpli);
		
		rr.save(gulyas);
		
		User jano=new User();
		jano.setNev("jano");
		jano.setPassword("123");
		
		ur.save(jano);
		
		User jeno=new User();
		jeno.setNev("jeno");
		jeno.setPassword("123");
		
		ur.save(jeno);
	}}
