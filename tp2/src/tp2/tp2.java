package tp2;

public class tp2 {

	public static void main(String[] args) {
		FeuDeSignalisation feu1 = new FeuDeSignalisation();

		FeuDeSignalisation feu2 = new FeuDeSignalisation();

		feu1.setColor("Yellow");

		feu2.setColor("Red");

		System.out.println("feu1 = :" + feu1.getColor());

		System.out.println("feu1 = :" + feu2.getColor());

		System.out.println("initial hight :" + FeuDeSignalisation.getHight());

		FeuDeSignalisation.setHight(15);

		System.out.println("initial hight :" + FeuDeSignalisation.getHight());

		feu1.flash(500,1000);

		feu1.flash(2000);

		feu1.flash();
	}

}
