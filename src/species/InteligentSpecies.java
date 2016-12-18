package species;

import java.util.ArrayList;

import objects.Environment;
import objects.Nutrient;

public class InteligentSpecies extends Species{
	
	public void live(Environment e){
		setAge(getAge() + .1);
		setBelief(getBelief() + getLossRate() + getLossRateChange());
		setHealth(100); //TODO based on crowdedness and how many nutrients are available
		
		
		
	}

	@Override
	public void isAlive() {
		// TODO Auto-generated method stub
		
	}




}
