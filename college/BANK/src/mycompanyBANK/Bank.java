package mycompanyBANK;

public class Bank {
	private int accountNo;
	private String name;
	private float amount;
						//123  //Tiho	//50$
	public void insert (int a,String n,float amt)
	{
		this.accountNo=a;
		this.name=n;
		this.amount=amt;
	}
	public void deposit (float amt)
	{
		this.amount=this.amount + amt;
		System.out.println(amt +"depoited");
	}
	public void wirhdraw (float amt)
	{
		if(amount < amt)
			System.out.println("Insufficent balance");
		else {
		this.amount = this.amount-amt;
		System.out.println(amt +"with draw");
		}
	}
	public void checkBalance()
	{
		System.out.println("BALANCE="+this.amount);
	}
	public String toString() {
		return "Account"+"accountNo"+account.No+", name"+name+",amount"+amount;
	}

}
