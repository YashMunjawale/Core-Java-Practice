package p2;

public class Test {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		int a = Integer.parseInt(args[0]);
		
		int b = Integer.parseInt(args[1]);
		
		int c = a/b;
		
		System.out.println("answer is :"+ c);

	}

}
