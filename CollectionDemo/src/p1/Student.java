package p1;

import java.util.ArrayList;
import java.util.TreeSet;

public class Student implements comparable {

	int roll;
	String name;

	Student(int i, String nm) {

		this.roll = i;
		this.name = nm;
	}

	public boolean equals(Object obj) {
		System.out.println("in equals");
		Student s1 = (Student) obj;
		if (s1.roll == this.roll) {
			return true;
		}

		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	public int compareTo(Object o) {
		System.out.println("inside compare to");
		Student s2 = (Student) o;// downcast
		return this.roll - s2.roll;
	}

	class Demo {

		public static void main(String[] args) {

			TreeSet<Student> studentlist = new TreeSet<Student>();
			studentlist.add(new Student(10, "Sachin"));
			studentlist.add(new Student(18, "virat"));
			studentlist.add(new Student(7, "ronaldo"));
			studentlist.add(new Student(45, "rohit"));

			if (studentlist.contains(new Student(18, "virat"))) {
				System.out.println("found");
			} else {
				System.out.println("not found");
			}

		}
	}

	public static void main(String[] args) {

		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student(10, "Sachin"));
		studentlist.add(new Student(18, "virat"));
		studentlist.add(new Student(7, "ronaldo"));
		studentlist.add(new Student(45, "rohit"));

		for (Student s1 : studentlist) {
			System.out.println(s1);
		}
		if (studentlist.contains(new Student(18, "virat"))) {
			System.out.println("found");
		} else {

			System.out.println("not found");
		}

	}

}
