package Lab_7_exo2;

public class Main {

	public static void main(String[] args) {
		Bank acc = new Bank("1~#{","tiho",500);
		Bank acc2 = new Bank("1~#5-","anes", 500);
		Bank acc3 = new Bank("&é(-è_)","ghiz_biz",1000000000);
		
		System.out.println(acc.credit(500));
		System.out.println(acc.debit(1000));
		System.out.println(acc.debit(500));
		
		System.out.println(acc.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());

	}

}
