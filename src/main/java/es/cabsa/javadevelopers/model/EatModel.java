package es.cabsa.javadevelopers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eat", schema = "jungle")
public class EatModel{
	
	@Id
	private String animal;
	
	@Column(name = "food", nullable = false)
	private String food;
	
	public EatModel() {
	
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}   
	
	public String getFood() {
		return food;
	}

	public void setFood(String Food) {
		this.food = food;
	}   
	
}
