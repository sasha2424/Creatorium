package objects;

import java.util.ArrayList;

import species.Species;

public class Environment {
	private float x;
	private float y;

	private ArrayList<Nutrient> nutrients = new ArrayList<Nutrient>();
	private ArrayList<Species> species = new ArrayList<Species>();

	public Environment(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Adds a nutrient to the environment
	 * @param type the nutrient to be added
	 */
	public void addNutrient(Nutrient type) {
		int t = this.find(type);
		if(t == -1){
			nutrients.add(type);
		} else {
			nutrients.get(t).add(type.getAmount());
		}
	}
	
	/**
	 * Gets the location of a nutrient in the nutrients array. Returns -1 if it isn't there.
	 * @param type The nutrient to be found
	 * @return location of nutrient in nutrients array/-1 if it is not there
	 */
	public int find(Nutrient type){
		for(int i = 0; i < nutrients.size();i++){
			if(nutrients.get(i).equals(type)){
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	 * Tests if the environment has a certain nutrient
	 * @param type the nutrient to be found
	 * @return if the environment has the 
	 */
	public boolean contains(Nutrient type){
		for(int i = 0; i < nutrients.size();i++){
			if(nutrients.get(i).equals(type)){
				return true;
			}
		}
		return false;
	}
	

}
