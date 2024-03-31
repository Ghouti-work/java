package exo2;

public class Switch {
	private int s;
	
	public Switch() {
		this.s = 0;
	}
	
	public void get_on(Lamp l) {
		this.s = 1;
		l.lamp_switch(s);
	}
	
	public void get_off(Lamp l) {
		this.s = 0;
		l.lamp_switch(s);
	}
	
	
}
