package p2;

class Voter{
	
	int age;
	
	Voter(int a){
		
		this.age=a;
	}

	@Override
	public String toString() {
		return "Your age is"+this.age ;
	}
	
	
}// class voter ends here 

class AgeException extends RuntimeException{
	
	public String toString() {
		return "Your age is not eligible for voting" ;
	}
	
}// class AgeException ends here 

public class Test {
	
	public static void main(String[] args) {
		
		
		
		try {
			
			int a=Integer.parseInt(args[0]);
			if(a<18) {
				
				throw new AgeException();
			}
			
			else {
				Voter v1 = new Voter(a);
				System.out.println(v1);
				
			}
		}
		catch(AgeException ae) {
			
			System.out.println(ae);
		}
		catch(Exception e) {
			
			System.out.println("something went wrong");
			
			
		}
		
	}	
		
		public static void main1(String[] args) {
			
			try {
			System.out.println(args[0]);
			System.out.println(args[1]);
			
			int a = Integer.parseInt(args[0]);
			
			int b = Integer.parseInt(args[1]);
			
			int c = a/b;
			
			System.out.println("answer is :"+ c);
			
			}
			
			catch(ArithmeticException ae) {
				
				System.out.println("do not provide second argument as zero");
				
			}
			
			catch(ArrayIndexOutOfBoundsException ai) {
				System.out.println("provide at least two arguments");
				
			}
			
			catch(NumberFormatException nfe) {
				
				System.out.println("please provide numbers as input");
				
			}
			
			catch(Exception e) {
				
				System.out.println("something went wrong");
				
				
			}

		}

	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	