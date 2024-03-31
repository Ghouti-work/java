public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public void deplacer(int dx, int dy) {
        this.centre.deplacer(dx, dy);
    }

    public double surface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }

    public boolean estInterieur(Point p) {
        return this.centre.distance(p) < this.rayon;
    }

    public String toString() {
        return "Cercle(" + this.centre + ", " + this.rayon + ")";
    }
}
