package species;

import java.util.ArrayList;
import java.util.HashMap;

import objects.Nutrient;
import religions.Religion;

public class Species {
	
	private int health;
	private boolean inteligent;
	
	private double belief; // goes from 0 to 100
	private final double lossRate;
	private double lossRateChange;
	
	private Religion religion;
	
	private double age;
	
	private HashMap<String,Integer> nutrientConsumption;

	public Species(boolean I){
		inteligent = I;
		age = 0;
		if(I){
			lossRate = -.05;
		} else {
			lossRate = -.005;
		}
		lossRateChange = 0;

		religion = Religion.getAtheist();
		nutrientConsumption = new HashMap<String,Integer>();
	}
	
	public void addNutrientToCosumption(String name,int amount){
		nutrientConsumption.put(name, amount);
	}
	
	public void live(){
		age += .1;
		belief += lossRate + lossRateChange;
		health = 100; //TODO based on crowdedness and how many nutrients are available
	}
	
	public ArrayList<Nutrient> convertNutrients(ArrayList<Nutrient> a){
		//TODO
		return null;
		
	}
	
	public void changeLossRate(double c){
		lossRateChange +=c;
	}
	
	
}
