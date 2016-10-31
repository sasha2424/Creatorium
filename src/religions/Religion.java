package religions;

public class Religion {
	
	private String name;
	
	private static final String[] RELIGIONS = {"Toudism","vuvism","Igregism","sansism"};
	
	public Religion(String name){
		
	}
	
	public static Religion getAtheist(){
		return new Religion("atheist");
	}
	
	public static Religion getRandomReligion(){
		return new Religion(RELIGIONS[(int)(Math.random()*RELIGIONS.length)]);
	}
	
	public String getName(){
		return name;
	}
	
	public static boolean areSame(Religion a, Religion b){
		return a.getName().equals(b.getName());
	}
	
	public boolean isSame(Religion a){
		return Religion.areSame(this, a);
	}

}
