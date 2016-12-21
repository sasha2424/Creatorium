package species;

import static org.junit.Assert.*;

import org.junit.Test;

import objects.Environment;
import objects.Nutrient;

public class SpeciesTester {

	
	@Test
	public void test() {
		Environment e = new Environment(0,0);
		e.addNutrient(new Nutrient("A",10));
		InteligentSpecies i = new InteligentSpecies("Human");
		i.addNutrientToCosumption("A", 4);
		e.addSpecies(i);
		e.tick();
		System.out.println(e.get("A").getAmount());
		assertEquals((int)e.get("A").getAmount(),6);
	}

}
