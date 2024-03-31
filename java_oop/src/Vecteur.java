public class Vecteur {
    
    double x,y;

    public Vecteur(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void addition(Vecteur v) {
        this.x += v.x;
        this.y += v.y;
    }
}
