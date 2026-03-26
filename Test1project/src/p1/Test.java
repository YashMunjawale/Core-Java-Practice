package p1;

class Time{
	
	int hour;
	int minutes;
	int seconds;
	
	void display() {
		
		
		
		System.out.printf("\n the time is : %d:%d:%d",this.hour,this.minutes,this.seconds);
	}

	void setHour(int hour) {
		this.hour = hour;
	}

	void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	int getHour() {
		return hour;
	}

	int getMinutes() {
		return minutes;
	}

	int getSeconds() {
		return seconds;
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		
		Time t1; // reference
		
		t1 = new Time();
		
		t1.setHour(3);
		t1.setMinutes(20);
		t1.setSeconds(40);
		
		t1.display();

	}

}
