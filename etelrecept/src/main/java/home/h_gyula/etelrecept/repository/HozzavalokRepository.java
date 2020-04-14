package home.h_gyula.etelrecept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.h_gyula.etelrecept.entity.Hozzavalo;
@Repository
public interface HozzavalokRepository extends JpaRepository<Hozzavalo, Integer> {
	
//	Hozzavalo findOne(Hozzavalo hozzavalo);

}
