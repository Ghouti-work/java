package mycompany_lab_2;

public class FeuDeSignalisation {
	public String color;
	public static double HEIGHT;
	
    public FeuDeSignalisation() {
        this.color ="Rouge";
    }
    public FeuDeSignalisation(String color) {
        //this.color = color;
    	setColor(color);
    }
    
	public void setColor(String color) {
		this.color=color;
	}
	/*public String getColor() {
		return color;
	}*/
	/*public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	public void flash(int Onduree,int Offduree) {
	System.out.println("The height of THE Flash : "+color+" is : "+height);
	System.out.println("Flash : "+color+", light for:"+Onduree+" secondes , then off at : "+Offduree+"secondes.");
	}*/
}
