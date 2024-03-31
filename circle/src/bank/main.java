package bank;

public class main {

	public static void main(String[] args) {
		Account acc = new Account("1~#{","tiho",500);
		Account acc2 = new Account("1~#5-","anes");
		
		System.out.println(acc.credit(500));
		System.out.println(acc.debit(1000));
		System.out.println(acc.debit(500));
		
		acc.transferTo(acc2, 100);
		
		System.out.println(acc.toString());
		System.out.println(acc2.toString());
	}

}
