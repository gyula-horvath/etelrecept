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
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nev;
	private String password;
	@ManyToMany
	private List<Recept> likedReceptek=new ArrayList<Recept>();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Recept> getLikedReceptek() {
		return likedReceptek;
	}
	public void setLikedReceptek(List<Recept> likedReceptek) {
		this.likedReceptek = likedReceptek;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nev=" + nev + ", password=" + password + "]";
	}
	
}
