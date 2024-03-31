package exo2;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		Lamp l = new Lamp();
		Switch s = new Switch();
		
		while(i< 10) {
			s.get_on(l);
			
			s.get_off(l);
			
			i++;
		}


	}

}
