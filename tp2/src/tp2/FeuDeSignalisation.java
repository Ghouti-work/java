package tp2;

public class FeuDeSignalisation {
	private String color;

	private static int hight = 10;

	public FeuDeSignalisation() {

	this.setColor("Red") ;

	}

	public FeuDeSignalisation(String color) {

	this.setColor(color) ;

	}

	  

	public String getColor() {

	return color;

	}

	  

	public void setColor(String color) {

	this.color = color;

	}

	  

	public static int getHight() {

	return hight;

	}

	  

	public static void setHight(int newHight) {

	hight = newHight;

	}

	public void flash(int offDuration, int onDuration) {

	System.out.println("flashing " + color + " light with off duration: " + offDuration + "ms and on duration " + onDuration + "ms");

	}

	public void flash(int onDuration) {

	System.out.println("flashing " + color + " ms and on duration " + onDuration + "ms");

	}

	public void flash() {

	System.out.println("flashing " + color + " light ");

	}
}
