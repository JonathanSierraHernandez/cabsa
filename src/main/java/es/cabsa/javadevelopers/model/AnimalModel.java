package es.cabsa.javadevelopers.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "animal", schema = "jungle")
public class AnimalModel implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "legs", nullable = false)
	private int legs;		
		
	
	public AnimalModel() {
		}
	
	public AnimalModel(int id, String name, int legs) {
			super();
			this.id = id;
			this.name = name;
			this.legs = legs;
		}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToMany
	@JoinTable(
			  schema = "jungle",
			  name = "eat", 
			  joinColumns = @JoinColumn(name = "animal", referencedColumnName ="name"), 
			  inverseJoinColumns = @JoinColumn(name = "food", referencedColumnName ="name")
			)
	public Set<FoodModel> eatFoods;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}


}

