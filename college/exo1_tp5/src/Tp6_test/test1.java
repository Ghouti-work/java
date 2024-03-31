package Tp6_test;

public class test1 {
	static int i;

	static public void test(int i) {
		i++;
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		i = 5;
		test(i);
		System.out.println("i = " + i);
	}

}
