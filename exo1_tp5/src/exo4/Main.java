package exo4;

public class Main {

	public static void main(String[] args) {
		window mywindow = new window();
		mouse mymouse = new mouse();
		mywindow.issopen();
		System.out.println("the coordinates of the close point is x=50 and y=50 ");
		mymouse.mouseClick(mywindow, 50, 50);
	}

}
