package es.cabsa.javadevelopers.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "food", schema = "jungle")
public class FoodModel implements Serializable{
	
	@Id
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;	
	
	@ManyToMany(mappedBy = "eatFoods")
	public Set<AnimalModel> likes;	
	
	public FoodModel() {
		}
	
	public FoodModel(String name) {
			this.name = name;
		}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	



}
