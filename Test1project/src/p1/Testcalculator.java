package p1;

class Calculator{
	
	void  add(int a,int b){
		
		System.out.println("the answer is "+(a+b));
		
	}
	
	void  add(double d1,double d2) {
		
		System.out.println("the answer is "+ (d1+d2));
		
		
	}
	
	void add(int a,double d){
		
		System.out.println("the answer is" + (a+d));
		
		
	}
}

public class Testcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1;
		
		c1=new Calculator();
		int i1=10;
		int i2=20;
		
		c1.add(i1,i2);
		
		double d1=8.9;
		double d2=20.8;
		
		c1.add(d1,d2);
		
		
		int i3=30;
		double d3=3.5;
		
		c1.add(i3,d3);
		

	}

}
