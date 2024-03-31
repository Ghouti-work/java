package mycompany_lab_2;

public class Main {

	public static void main(String[] args) {
	FeuDeSignalisation feu1,feu2;
	feu1 = new FeuDeSignalisation();
    feu2 = new FeuDeSignalisation("vert");
    
    feu1.color="Orange";
    feu2.setColor("Orange");
    System.out.println(feu1.HEIGHT);
    System.out.println(feu2.getHEIGHT());
    feu1.HEIGHT	= 3.99;
    feu2.getHEIGHT =(7.99);
	}
}
