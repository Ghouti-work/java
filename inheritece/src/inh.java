public class Animal {
	void eat() {
		System.out.println("I am eating ...");
	}
	
}

public class Dog exetends Animal {
	void bark() {
		System.out.println("I ma barking ... ");
	}
}

public class byby_Dog exetends Dog {
	public void weep() {
		System.out.println("I ma weeping ... ");
	}
}
public class inh {

	public static void main(String[] args) {
		byby_Dog mbybydog = new byby_Dog();
		
		mbybydog.eat();
		mbybydog.brak();
		mbybydog.weep();

	}

}
