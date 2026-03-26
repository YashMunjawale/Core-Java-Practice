package p1;

class Bankaccount{
	
	int Acc_no;
	String Name;
	double balance;
	static double interest_rate;
	
	static {
		
		interest_rate=9.7;
	}
	
	
	Bankaccount(){
		
		this.Acc_no=101;
		this.Name="not given";
		this.balance=20;
		;
		
		
		
	}


	Bankaccount(int acc_no, String name, double balance) {
		
		Acc_no = acc_no;
		Name = name;
		this.balance = balance;
		
	}


	int getAcc_no() {
		return Acc_no;
	}


	void setAcc_no(int acc_no) {
		Acc_no = acc_no;
	}


	String getName() {
		return Name;
	}


	void setName(String name) {
		Name = name;
	}


	double getBalance() {
		return balance;
	}


	void setBalance(double balance) {
		this.balance = balance;
	}


	double getInterest_rate() {
		return interest_rate;
	}


	static void setInterest_rate(double ir) {
		interest_rate = ir;
	}
	
	
	void display() {
		
		System.out.println("the account no is:"+this.Acc_no);
		System.out.println("the account name is:"+this.Name);
		System.out.println("the account balance is:"+this.balance);
		System.out.println("the account interest_rate is:"+this.interest_rate);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bankaccount b1;
		b1=new Bankaccount(101,"yash",20);
		b1.display();
		System.out.println();
		
		Bankaccount b2=new Bankaccount(1234,"komal",50000);
		b2.display();
		System.out.println();
		
		
		Bankaccount b3=new Bankaccount(7,"vinayak",1);
		b3.display();
		System.out.println();
		
		Bankaccount.setInterest_rate(8.5);
		
		b1.display();
		System.out.println();
		
		b2.display();
		System.out.println();
		
		b3.display();
		
		
		
		
		
		

	}

}
