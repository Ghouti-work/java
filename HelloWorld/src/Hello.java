import java.util.Scanner;
public class Hello {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int x = scan.nextInt();
		
		/*System.out.println("enter number2");
		int y =scan.nextInt();
		int an ;*/
		/*an =x*y;
		System.out.println("The resulat is :"+an);
		System.out.print(an+2);*/
		if (x == 10)
		{
			System.out.println("x == 10");
		}
		
		int score = 90;
		switch(score=50)
		{
		//score = 50;
		case 90 :
			System.out.println("it is true");
			break;
		case 40 :
			System.out.println("it is 40");
			break;
		case 50 :
			System.out.println("it is 50");
			break;
		default :
			System.out.println("ok");
		
		}
	}

}
