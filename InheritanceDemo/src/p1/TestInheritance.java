package p1;

class Student{
	
	int fbid;
	String name;
	int distance;
	
	
	Student(){
		
		this.fbid=100;
		this.name="not given";
		this.distance=50;
		
	}


	Student(int fbid, String name, int distance) {
		super();
		this.fbid = fbid;
		this.name = name;
		this.distance = distance;
	}


	int getFbid() {
		return fbid;
	}


	void setFbid(int fbid) {
		this.fbid = fbid;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	int getDistance() {
		return distance;
	}


	void setDistance(int distance) {
		this.distance = distance;
	}
	
	void display() {
		
		System.out.println("the id is :"+ fbid);
		System.out.println("the name is :"+name);
		System.out.println("the distance is :"+distance);
		
	}
	
	
}// class student ends here

class PlacedStudent extends Student{
	
	String company;
	String designation;
	
	PlacedStudent(){
		super();
		this.company="not given";
		this.designation="not assigned";
		
		
	}

	PlacedStudent( int fbid,String name,int distance,String company, String designation) {
		super(fbid,name,distance);
		this.company = company;
		this.designation = designation;
	}

	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}
	
	void display() {
		
		super.display();
		System.out.println("the company is:"+company);
		System.out.println("the designation is:"+designation);
	}
	
} //class placedstudent ends here




public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlacedStudent p1;
		p1=new PlacedStudent();
		
		p1.setFbid(100);
		p1.setName("virat");
		p1.setDistance(800);
		p1.setCompany("RCB");
		p1.setDesignation("Opener");
		p1.display();

	}

}
