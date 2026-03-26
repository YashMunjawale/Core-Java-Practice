package p1;

class Date{
	
	int day;
	int month;
	int year;
	String dow;
	
	Date() // default constructor 
	{
		
		this.day=12;
		this.month=12;
		this.year=2026;
		this.dow="Wednesday";
		
	}
	
	
	
	Date(int day, int month, int year, String dow) // parameterized constructor
	{
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.dow = dow;
	}





	int getDay() {
		return day;
	}



	void setDay(int day) {
		this.day = day;
	}



	int getMonth() {
		return month;
	}



	void setMonth(int month) {
		this.month = month;
	}



	int getYear() {
		return year;
	}



	void setYear(int year) {
		this.year = year;
	}



	String getDow() {
		return dow;
	}



	void setDow(String dow) {
		this.dow = dow;
	}



	void display() {
		
		System.out.printf(" \n the date is :%d / %d / %d ", this.day,this.month,this.year );
		System.out.println("the day of the week :"+this.dow);
		
	}
	
} // Date class ends here

public class Test {

	public static void main(String[] args) {
		
		Date d1; // reference 
		
		d1= new Date();
		
		//System.out.println(d1);
		
		d1=new Date();
		
		Date d2;
		d2=new Date();
		
		//System.out.println(d1);
		
		d1.setDay(17);
		d1.setMonth(3);
		d1.setYear(2026);
		d1.setDow("wednesday");
		d1.display();
		
		
		//System.out.printf("%d / %d / %d ", d1.day,d1.month,d1.year );
		
		d2.setDay(12);
		d2.setMonth(05);
		d2.setYear(2020);
		d2.display();
		
		
		//System.out.printf(" \n  %d/%d/%d",d2.day,d2.month,d2.year);

	}

}
