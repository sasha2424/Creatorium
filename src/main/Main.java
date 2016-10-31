package main;

import java.util.ArrayList;

import processing.core.PApplet;
import species.Species;

public class Main extends PApplet{
	
	public static final int WINDOW_SIZE = 600;
	public static final boolean FULLSCREEN = true;
	
	ArrayList<Species> s = new ArrayList<Species>();
	
	public void settings(){
		size(WINDOW_SIZE, WINDOW_SIZE);
		
		
	}
	
	public void setup(){
		
	}
	
	public void draw(){
		ellipse(10,10,100,100);
		
	}
	
	
	public static void main(String[] args){
		PApplet.main("main.Main", args);
	}

}
