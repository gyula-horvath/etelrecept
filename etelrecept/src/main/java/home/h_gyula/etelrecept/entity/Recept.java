package home.h_gyula.etelrecept.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Recept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nev;
	private String nehezseg;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "receptek")
	private List<Hozzavalo> hozzavalok=new ArrayList<>();
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "likedReceptek")
	List<User> users=new ArrayList<User>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getNehezseg() {
		return nehezseg;
	}
	public void setNehezseg(String nehezseg) {
		this.nehezseg = nehezseg;
	}
	public List<Hozzavalo> getHozzavalok() {
		return hozzavalok;
	}
	public void setHozzavalok(List<Hozzavalo> hozzavalok) {
		this.hozzavalok = hozzavalok;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Recept [id=" + id + ", nev=" + nev + ", nehezseg=" + nehezseg + "]";
	}
	
	
}
