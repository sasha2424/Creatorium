package species;

import java.util.ArrayList;

import java.util.HashMap;

import objects.Nutrient;
import religions.Religion;
import objects.Environment;

public class Species {
	
	private double health; // 0 - 100 %
	private String type;
	private double age; // 1 = 1 year .1 per tick
	
	private HashMap<String,Integer> nutrientConsumption;

	public Species(String type){
		this.type = type;
		age = 0;
		nutrientConsumption = new HashMap<String,Integer>();
	}
	

	public void live(Environment e){
		setAge(getAge() + .1);
		setHealth(100); //TODO based on crowdedness and how many nutrients are available
		
		this.convertNutrients(e.getNutrients());
	}
	
	protected void convertNutrients(ArrayList<Nutrient> nutrients){
		for(Nutrient n : nutrients){
			int t = nutrientConsumption.get(n.getType());
			n.add(-1*t);
		}
	}
	
	public boolean isAlive(){
		return health>0;
	}
	
	protected void addNutrientToCosumption(String name,int amount){
		nutrientConsumption.put(name, amount);
	}
	

	
	//______GETTERS AND SETTERS_______
	
	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}
	
	protected double getHealth() {
		return health;
	}

	protected void setHealth(int health) {
		this.health = health;
	}

	protected double getAge() {
		return age;
	}

	protected void setAge(double age) {
		this.age = age;
	}

	protected HashMap<String, Integer> getNutrientConsumption() {
		return nutrientConsumption;
	}

	protected void setNutrientConsumption(HashMap<String, Integer> nutrientConsumption) {
		this.nutrientConsumption = nutrientConsumption;
	}
	
	
	
	
	
	
}

