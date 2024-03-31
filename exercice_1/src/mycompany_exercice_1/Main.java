package mycompany_exercice_1;

public class Main {
	public static void main(String[] args) {
		Complexe a,b ;
		a = new Complexe(3.0,2.0);
		b = new Complexe(4.0,-2.0);
		System.out.print("a = ");
	    a.afficher();
	    System.out.print("b = ");
	    b.afficher();
	    a.additionner(b);
	    System.out.print("Somme = ");
        a.afficher();
        a.multiplier(b);
        System.out.print("Produit = ");
        a.afficher();
        Complexe conj_de_a = a.conjugue();
        System.out.print("Conjugué de a = ");
        conj_de_a.afficher();
	}

}
