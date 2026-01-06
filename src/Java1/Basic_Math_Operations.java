package Java1;

public class Basic_Math_Operations {
	
	 static int addition(int a, int b) {
		return a+b;
	} 
	static int sub(int a, int b) {
		return a-b;
	}
	static int multiplication(int a, int b) {
		return a*b;
	}
	static int division(int a, int b) {
		return a/b;
	}
	static int remainder (int a, int b) {
		return a%b;
	}
	static int square (int a) {
		return a*a;
	}
	static int cube (int a) {
		return a*a*a;
	}
	static int absolute(int a) {
		return Math.abs(a);
	}
	
	
	public static void main (String args[]) {
		
		int x=10, y=5;
		
		System.out.println("Addition = "+addition(x,y));
		System.out.println("Subtraction = "+sub(x,y));
		System.out.println("Multiplication = "+multiplication(x,y));
		System.out.println("Division = "+division(x,y));
		System.out.println("Remainder = "+remainder(x,y));
		System.out.println("Square = "+square(x));
		System.out.println("Cube = "+cube(x));
		System.out.println("Absolute value = "+absolute(-20));
		
		
	}

}
