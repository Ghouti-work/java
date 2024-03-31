package exo2;

public class Lamp {
	private int s;
	
	public Lamp() {
		this.s = 0;
	}
	
	public void lamp_switch(int x) {
		if(x == 1)
			System.out.println(" Lamp on ");
		else 
			System.out.println(" Lamp off ");
	}
}
