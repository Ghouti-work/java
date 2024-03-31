package lab_3;

public class Main {
	public static void main(String[] args) {
		Car vitesse = new Car();
		 vitesse.setSpeed(50.0);
		System.out.println("SPEED IS :"+vitesse.getSpeed());
		double INC = 40.0;
		vitesse.incSpeed(INC);
		System.out.println("SPEED IS AUGMENTED TO :"+vitesse.getSpeed());
	}
}
