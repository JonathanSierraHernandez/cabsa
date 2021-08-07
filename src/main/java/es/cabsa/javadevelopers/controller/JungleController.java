package es.cabsa.javadevelopers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.cabsa.javadevelopers.model.EatModel;
import es.cabsa.javadevelopers.model.FoodModel;
import es.cabsa.javadevelopers.services.AnimalService;
import es.cabsa.javadevelopers.services.EatService;
import es.cabsa.javadevelopers.services.FoodService;

@RestController
public class JungleController {
	
  @Autowired
  AnimalService animalService; 
  
  @Autowired
  FoodService foodService;
  
  @Autowired
  EatService eatService;
  
	/**
	 * Get a list of animals and what they eat
	 */
	@GetMapping("/animals")
	public List<EatModel> getAnimalsFoods() {
		return eatService.getAnimalFoods();
	}
	
	/**
	 * Find animals by food
	 */
	@GetMapping("/animals/{food}")
	public List<EatModel> getEat(@PathVariable String food) {
		return eatService.getAnimalByFood(food);
	}
	
	

	/**
	 * Find animal by name (unique name)
	 */
	@GetMapping("/animal/{name}")
	public String getAnimal(@PathVariable String name) {
		return animalService.getAnimal(name);
	}
	
	
	/**
	 * Create a new food
	 * @param food as JSON file
	 */
	@PostMapping(value = "/food", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void createFood(@RequestBody FoodModel food) {
	    foodService.saveFood(food);
	}

}
