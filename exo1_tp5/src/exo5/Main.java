package exo5;

public class Main {

	public static void main(String[] args) {
		emp emploiyee = new emp();
	    emp manager = new emp();
	    System.out.println("first");
	    emploiyee.Type();
	    System.out.println("secand");
	    manager.Type();
	    manager.up(manager, "manager");
	    // manager.Type();
	}

}
