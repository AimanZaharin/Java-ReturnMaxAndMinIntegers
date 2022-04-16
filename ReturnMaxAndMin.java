// TestMax.java: demonstrate using the max method
import java.util.Scanner;

public class ReturnMaxAndMin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 different integers to identify "
				+ "the maximum and minimum: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int answer = max(num1, num2); // If the method returns a value, a call to the method is usually treated as a value.
		
		System.out.println("The maximum between " + num1 +
				" and " + num2 + " is " + answer);
	
	}
		
	public static int max(int num1, int num2) {
		
		int result;
		
		if(num1 > num2)
			result = num1;
		
		else
			result = num2;
		
		return result;
	}
			
	}

//One of the benefits of methods is for sharing and reuse. The max method can be invoked
//from any class besides ReturnMaxAndMin. If you create a new class Test, you can invoke the max
//method using ClassName.methodName (i.e., ReturnMaxAndMin.max). 

