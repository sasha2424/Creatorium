package objects;

import java.util.ArrayList;

public class Environment {
	private float x;
	private float y;

	private ArrayList<Nutrient> nutrients = new ArrayList<Nutrient>();

	public Environment(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void addNutrient(float amount, Nutrient type) {
		nutrients.add(type);
	}
	

}
