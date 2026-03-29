package p2;

import java.util.HashSet;

class Student {

	int roll;
	String name;

	Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	public int hashCode() {
		System.out.println("inside hashcode");

		return this.roll;

	}

	@Override
	public boolean equals(Object obj) {

		System.out.println("inside equals");
		Student s1 = (Student) obj;
		if (this.roll == s1.roll) {
			return true;
		} else {
			return false;
		}

	}

}

public class Demo {

	public static void main(String[] args) {

		HashSet<Student> sthashset = new HashSet<Student>();

		sthashset.add(new Student(115, "Vinayak"));
		sthashset.add(new Student(151, "Rohit"));
		sthashset.add(new Student(15, "Virat"));

		for (Student s1 : sthashset) {
			System.out.println(s1);

		}
	}
}