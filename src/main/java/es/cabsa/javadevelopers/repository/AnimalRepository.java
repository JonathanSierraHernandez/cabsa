package es.cabsa.javadevelopers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.cabsa.javadevelopers.model.AnimalModel;



@Repository
public interface AnimalRepository extends JpaRepository<AnimalModel, Long>{
	
	@Query(value = "SELECT * FROM jungle.animal WHERE name = ?1", nativeQuery = true)
    String findAnimalByName(String name);

}
