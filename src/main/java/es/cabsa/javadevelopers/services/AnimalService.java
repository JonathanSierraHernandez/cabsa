package es.cabsa.javadevelopers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cabsa.javadevelopers.model.AnimalModel;
import es.cabsa.javadevelopers.repository.AnimalRepository;

@Service
public class AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;

	public AnimalService() {

	}

    /**
     * Get all animals
     */
    public List<AnimalModel> getAnimals() {
    	return animalRepository.findAll();
    }
    
    /**
     * Get a animal
     */
    public String getAnimal(String name) {
    	return animalRepository.findAnimalByName(name);
    }
	

}
