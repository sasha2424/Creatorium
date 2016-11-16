package objects;

public class Nutrient {
	private String name;
	private double amount;

	public Nutrient(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public void add(double a) {
		amount += a;
	}

	public void remove(double a) {
		amount -= a;
	}
	
	public String getType(){
		return name;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public boolean equals(Nutrient t){
		return this.getType().equals(t.getType());
	}

}
