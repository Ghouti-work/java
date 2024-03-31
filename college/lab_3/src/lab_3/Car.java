package lab_3;

public class Car {
	public double speed;
	public double incSpeed;
	public double decSpeed;
	public double incSpeed_add;
	
	public Car() {
		this.speed=0;
	}
	public Car(double speed) {
		this.speed=speed;
	}
	public void setSpeed(double speed) {
		this.speed=speed;
	}
	public double getSpeed() {
		return speed;
	}
	public void incSpeed() {
		if(this.speed >= 0) 
		{
			this.speed +=1;
			incSpeed = this.speed;
		}
	
	}
	public void decSpeed() {
		if(this.speed > 0) 
		{
			this.speed -=1;
			decSpeed=this.speed;
		}
		
	}
	public void incSpeed(double add) {
		if(add >= 0) {
			this.speed += add;
			incSpeed_add = this.speed;
		}
		
	}
}

