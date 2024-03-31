package mycompany_exercice_1;

public class Complexe {
		public double r;
		public double i;
		
		public Complexe () {
			this.r=0.0;
			this.i=0.0;
		}
		Complexe(double r,double i){
			this.r=r;
			this.i=i;
		}
		void additionner(Complexe c) {
			this.r= this.r + c.r;
			this.i= this.i +c.i;
		}
		void multiplier(Complexe c) {
			double a= this.r;
			double b= this.i;
			double ac,ad,bc,bd;
			ac = a * c.r;
			ad = a * c.i;
			bc = b * c.i;
			bd = b * c.r;
			
			this.r = ac - bd;
			this.i = ad + bc;
		}
		Complexe conjugue() {
			this.i = -this.i;
			return new Complexe(this.r,this.i);
		}
		void afficher() {
			if(this.i < 0) {
				System.out.println(this.r +"-i"+(-this.i));
			}
			else {
				System.out.println(this.r +"i"+this.i);
			}
		}
}
