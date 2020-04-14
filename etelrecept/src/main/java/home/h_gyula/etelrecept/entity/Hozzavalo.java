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
public class Hozzavalo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nev;
	private String mertekegyseg;
	private String mennyiseg;
	@ManyToMany
	private List<Recept> receptek=new ArrayList<>();
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
	public String getMertekegyseg() {
		return mertekegyseg;
	}
	public void setMertekegyseg(String mertekegyseg) {
		this.mertekegyseg = mertekegyseg;
	}
	public String getMennyiseg() {
		return mennyiseg;
	}
	public void setMennyiseg(String mennyiseg) {
		this.mennyiseg = mennyiseg;
	}
	public List<Recept> getReceptek() {
		return receptek;
	}
	public void setReceptek(List<Recept> receptek) {
		this.receptek = receptek;
	}
	@Override
	public String toString() {
		return "Hozzavalo [id=" + id + ", nev=" + nev + ", mertekegyseg=" + mertekegyseg + ", mennyiseg=" + mennyiseg
				+ "]";
	}
	
	
}
