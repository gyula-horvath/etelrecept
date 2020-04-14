package home.h_gyula.etelrecept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.h_gyula.etelrecept.entity.Recept;
@Repository
public interface ReceptRepository extends JpaRepository<Recept, Integer> {
}
