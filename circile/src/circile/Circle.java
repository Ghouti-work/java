package circile;

class Circle {
	
	private double radius;
	private String color;
	
	public Circle() {
		this.radius = 1.0 ;
		this.color = "red" ;
	}
	public Circle(double radius) {
		this.radius=radius;
		this.color = "red" ;
	}
	public Circle(double radius,String color) {
		this.radius = radius;
		this.color =color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getCircumference() {
		return 2 * Math.PI * radius ;
	}
	public String toString() {
		return "Circle{" + "radius="+ radius + ",color=" + color + '}';
	}

}
