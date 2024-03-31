package circle;

public class main {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		System.out.println("the area is " + c1.getArea());
		System.out.println("the radius is " + c1.getRadius());
		
		Circle c2 = new Circle(2.0);

		System.out.println("the area 2 is " + c2.getArea());
		System.out.println("the radius 2 is " + c2.getRadius());
		
		Circle c3 = new Circle(3.0,"Bleu");
		
		System.out.println("the area 2 is " + c3.getArea());
		System.out.println("the radius 2 is " + c3.getRadius());
		
		c3.setRadius(4.0);
		
		System.out.println("the radius 2 is " + c3.getRadius());
		
		c3.setColor("Black");
		
		System.out.println("the radius 2 is " + c3.getColor());
		
		System.out.println(c3.toString());
		
	}

}
