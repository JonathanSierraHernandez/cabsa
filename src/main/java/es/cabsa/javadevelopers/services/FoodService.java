package es.cabsa.javadevelopers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cabsa.javadevelopers.model.FoodModel;
import es.cabsa.javadevelopers.repository.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository foodRepository;

	public FoodService() {

	}

    /**
     * Get all foods
     */
    public List<FoodModel> getFoods() {
    	return foodRepository.findAll();
    }
    
    /**
     * Save a new food
     */
    public void saveFood(FoodModel food) {
    	foodRepository.save(food);
    }

}
