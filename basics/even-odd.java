import java.io.*;

class EvenOdd{

	public static void main(String args[]){
		Console c = System.console();
		int num = Integer.parseInt(c.readLine("Enter a number to check even or odd : "));
		
		if(num % 2 == 0) 
			System.out.println("The number is an even number.");
		else
			System.out.println("The number is an odd number.");
	}
}
			
		
