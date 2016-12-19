package species;

import java.util.ArrayList;
import java.util.HashMap;

import objects.Environment;
import objects.Nutrient;
import religions.Religion;

public class InteligentSpecies extends Species{
	
	private Religion religion;
	
	public InteligentSpecies(){
		super();
		religion = Religion.getAtheist();
	}
	
	public void live(Environment e){
		setAge(getAge() + .1);
		setBelief(getBelief() + getLossRate() + getLossRateChange());
		setHealth(100); //TODO based on crowdedness and how many nutrients are available
		
		this.convertNutrients(e.getNutrients());
		
	}

	@Override
	public void isAlive() {
		// TODO Auto-generated method stub
		
	}


	protected Religion getReligion() {
		return religion;
	}

	protected void setReligion(Religion religion) {
		this.religion = religion;
	}

}
