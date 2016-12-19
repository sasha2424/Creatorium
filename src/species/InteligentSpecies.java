package species;

import java.util.ArrayList;
import java.util.HashMap;

import objects.Environment;
import objects.Nutrient;
import religions.Religion;

public class InteligentSpecies extends Species{
	
	private Religion religion;
	
	private double belief; // goes from 0 to 100%
	private double lossRate;
	private double lossRateChange;
	
	public InteligentSpecies(){
		super();
		lossRateChange = 0;
		religion = Religion.getAtheist();
	}
	
	public void live(Environment e){
		setAge(getAge() + .1);
		setBelief(getBelief() + getLossRate() + getLossRateChange());
		setHealth(100); //TODO based on crowdedness and how many nutrients are available
		
		this.convertNutrients(e.getNutrients());
		
	}


	protected Religion getReligion() {
		return religion;
	}

	protected void setReligion(Religion religion) {
		this.religion = religion;
	}
	
	public void changeLossRate(double c){
		lossRateChange +=c;
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

}
