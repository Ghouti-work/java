package Lab_7_exo1;

public class Class_test {
	private int date;
	private String tmp;
	public Class_test()
	{
		date = 0;
	}
	public void set_value(int date) 
	{
		tmp = "" + date; 
	}
	
	public String get_value() {
		return tmp;
	}
}
