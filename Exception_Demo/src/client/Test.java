package client;

import programmer.*;

public class Test {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);

		Voter v1 = new Voter(a);

		try {
			v1.validate();

		} catch (AgeException e) {
			System.out.println("Main wala hai");
			System.out.println(e);
		}
	}

}
