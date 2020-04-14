package home.h_gyula.etelrecept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.h_gyula.etelrecept.entity.Recept;
import home.h_gyula.etelrecept.entity.User;
import home.h_gyula.etelrecept.repository.ReceptRepository;
import home.h_gyula.etelrecept.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository ur;
	
	@Autowired
	ReceptRepository rr;
	
	public List<User> existingUser(String nev) {
		return ur.findByNev(nev);
	}
	
	public void saveUser(User user) {
		ur.save(user);
	}
	
	public List<User> allUsers() {
		return ur.findAll();
	}
	
	public void userLikesRecept(Integer users_id, Integer receptek_id) {
		User user=ur.getOne(users_id);
		Recept recept=rr.getOne(receptek_id);
		user.getLikedReceptek().add(recept);
		recept.getUsers().add(user);
		rr.save(recept);
		ur.save(user);
	}
}
