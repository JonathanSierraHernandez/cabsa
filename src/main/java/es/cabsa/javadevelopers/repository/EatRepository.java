package es.cabsa.javadevelopers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import es.cabsa.javadevelopers.model.EatModel;

@Repository
public interface EatRepository extends JpaRepository<EatModel, String>{
	
	@Query(value = "SELECT * FROM jungle.eat WHERE food = ?1", nativeQuery = true)
	List<EatModel> findAnimalsByFood(String food);
	

}
