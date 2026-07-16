import java.io.*;

class FactorialNumber{

	public static void main(String args[]){
		Console c = System.console();
		int num = Integer.parseInt(c.readLine("Enter a number to calculate factorial : "));
		long fact = 1;
		for(int i = 1; i <= num; i++){
			fact = fact * i;
		}
		System.out.println("Factorial of the number "+ num + " is : "+  fact);
	}
}
			
		
