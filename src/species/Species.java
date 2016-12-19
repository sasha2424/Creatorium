package species;

import java.util.ArrayList;

import java.util.HashMap;

import objects.Nutrient;
import religions.Religion;
import objects.Environment;

public abstract class Species {
	
	private double health; // 0 - 100 %
	
	private double belief; // goes from 0 to 100%
	private double lossRate;
	private double lossRateChange;
	
	private double age; // 1 = 1 year .1 per tick
	
	private HashMap<String,Integer> nutrientConsumption;

	public Species(){
		age = 0;
		lossRateChange = 0;
		nutrientConsumption = new HashMap<String,Integer>();
	}
	
	public abstract void live(Environment e);
	public abstract void isAlive();
	
	protected void convertNutrients(ArrayList<Nutrient> nutrients){
		for(Nutrient n : nutrients){
			int t = nutrientConsumption.get(n.getType());
			n.add(-1*t);
		}
	}
	
	protected void addNutrientToCosumption(String name,int amount){
		nutrientConsumption.put(name, amount);
	}
	
	public void changeLossRate(double c){
		lossRateChange +=c;
	}

	protected double getHealth() {
		return health;
	}

	protected void setHealth(int health) {
		this.health = health;
	}

	protected double getBelief() {
		return belief;
	}

	protected void setBelief(double belief) {
		this.belief = belief;
	}

	protected double getLossRate() {
		return lossRate;
	}

	protected void setLossRate(double lossRate) {
		this.lossRate = lossRate;
	}

	protected double getLossRateChange() {
		return lossRateChange;
	}

	protected void setLossRateChange(double lossRateChange) {
		this.lossRateChange = lossRateChange;
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

