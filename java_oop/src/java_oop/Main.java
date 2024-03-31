package java_oop;

public class Main 
{	
	public static void main(String args[])
	{
		Circle c1,c2;
		c1 = new Circle(); 
		c2 = new Circle(1.0,"red");
		c1.setRadius(3.0);
		c1.setColor("Black");
		System.out.println("C1 area = "+c1.getArea());
	}
	
	
}
