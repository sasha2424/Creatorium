package species;

import static org.junit.Assert.*;

import org.junit.Test;

import objects.Environment;
import objects.Nutrient;

public class SpeciesTester {

	@Test
	public void test() {
		fail("Not yet implemented");
		Environment e = new Environment(0,0);
		e.addNutrient(new Nutrient("A",10));
		InteligentSpecies i = new InteligentSpecies();
		i.addNutrientToCosumption("A", 4);
		assertEquals();
	}

}
