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
	
	
	public void addNutrient(Nutrient type) {
		int t = this.find(type);
		if(t == -1){
			nutrients.add(type);
		} else {
			nutrients.get(t).add(type.getAmount());
		}
	}
	
	public int find(Nutrient type){
		for(int i = 0; i < nutrients.size();i++){
			if(nutrients.get(i).equals(type)){
				return i;
			}
		}
		return -1;
	}
	
	public boolean contains(Nutrient type){
		for(int i = 0; i < nutrients.size();i++){
			if(nutrients.get(i).equals(type)){
				return true;
			}
		}
		return false;
	}
	

}
