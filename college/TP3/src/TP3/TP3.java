package TP3;

public class TP3 {

	public static void main(String[] args) {
		Complexe c1 = new Complexe(2,-4);
		Complexe c2 = new Complexe(3,5);
		
		System.out.println("le complexe c1 est :");
		c1.afficher(c1);
		System.out.println("le complexe c2 est :");
		c2.afficher(c2);
		
		c1.additionner(c2);
		System.out.println("l'addition de c1 et c2 est :");
		c1.afficher(c1);
		c1 = c1.additionner2(c2);
		System.out.println("l'addition de c1 et c2 est :");
		c1.afficher(c1);
		
		c1.multiplier(c2);
		System.out.println("multiple de c1 et c2 est :");
		c1.afficher(c1);
		c2.multiplier2(c2);
		System.out.println("multiple de c1 et c2 est :");
		c2.afficher(c2);
		
		System.out.println("le conjegue de c1 est :");
		c1.conjugue(c1);
		c1.afficher(c1);
		
		Complexe.comp(c1,c2);
	}
	

}
