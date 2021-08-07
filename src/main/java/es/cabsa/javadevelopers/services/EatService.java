package es.cabsa.javadevelopers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cabsa.javadevelopers.model.EatModel;
import es.cabsa.javadevelopers.repository.EatRepository;

@Service
public class EatService {
	
	@Autowired
	private EatRepository eatRepository;

	public EatService() {

	}

    /**
     * Get all animals with foods
     */
    public List<EatModel> getAnimalFoods() {
    	return eatRepository.findAll();
    }

    /**
     * Get animals by food
     */
    public List<EatModel> getAnimalByFood(String food) {
    	return eatRepository.findAnimalsByFood(food);
    }
	

}
