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
	
	
	
	
	public void tick(){
		for(Species s: species){
			s.live(this);
		}
	}
	
	
	public void addSpecies(Species s){
		species.add(s);
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
	private int find(Nutrient type){
		for(int i = 0; i < nutrients.size();i++){
			if(nutrients.get(i).equals(type)){
				return i;
			}
		}
		return -1;
	}
	
	public Nutrient get(String type){
		for(Nutrient n: nutrients){
			if(n.getType().equals(type)){
				return n;
			}
		}
		return null;
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
	
	
	public ArrayList<Nutrient> getNutrients(){
		return nutrients;
	}
	

}
