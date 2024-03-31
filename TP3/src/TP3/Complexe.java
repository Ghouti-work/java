package TP3;

public class Complexe {
	private double r;
	private double i;
	
	Complexe(){
		r = 0;
		i = 0;
	}
	
	Complexe(double R, double I){
		r = R;
		i = I;
	}
	void additionner(Complexe c) {
		r += c.r ;
		i += c.i ;
 	}
	
	public Complexe additionner2(Complexe c) {
		r += c.r ;
		i += c.i ;
		return c;
	}
	
	void multiplier(Complexe c) {
		double r1 = (r*c.r - i*c.i) ;
		i = (r*c.r + i*c.i) ;	
		r = r1;
	}
	
	public Complexe multiplier2(Complexe c) {
		r = (r*c.r - i*c.i) ;
		i = (r*c.r + i*c.i) ;	
		return c;
	}
	
	void conjugue(Complexe c) {
		c.i = -c.i;
	}
	void afficher(Complexe c) {
		if(c.i >= 0) {
			System.out.println(c.r + "+ i" + c.i);
		}
		else {
			System.out.println(c.r + "- i" + c.i);
		}
	}
	
	static void comp(Complexe c1, Complexe c2) {
		if( c1.r == c2.r && c1.i == c2.i) {
			System.out.println("les coomplexe sont egaux");
		}
		else {
			System.out.println("les coomplexe ne sont pas egaux");
		}
		
	}
}
