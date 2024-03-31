package bank;

public class Account {
	private String id ;
	private String name;
	private int balance;
	
	public Account(String id,String name) {
		this.id=id;
		this.name=name;
		this.balance =0;
	}
	public Account(String id,String name,int balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getId(){
		return id;
	}
	public String getName() {
		return this.name;
	}
	public int getBalance() {
		return this.balance;
	}
	public int credit(int amount) {
		return this.balance + amount;
	}
	public int debit(int amount) {
		if(amount <= this.balance)
			this.balance -= amount;
		else
			System.out.println("Amount exceeded balance");
		return this.balance;
	}
	public int transferTo(Account c1,int amount) {
		c1.credit(amount); 
		this.debit(amount) ;
		return this.balance;
		
	}
	public String toString() {
		return "[ id : " + this.id + ", name : " + this.name + ", balance : " + this.balance + " ]" ;
	}
}

