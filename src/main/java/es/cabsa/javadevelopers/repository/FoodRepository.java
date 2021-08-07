package es.cabsa.javadevelopers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.cabsa.javadevelopers.model.FoodModel;

@Repository
public interface FoodRepository extends JpaRepository<FoodModel, Long>{

}
