import java.io.*;

class ReverseNumber{

	public static void main(String args[]){
		Console c = System.console();
		
		int num = Integer.parseInt(c.readLine("Enter a number to reverse the number : "));
		
		int rev = 0, mod;
		
		while(num > 0){
			mod = num % 10;
			rev = (rev * 10) + mod;
			num = num / 10;
		}
		System.out.println("The reverse number is : " + rev);
	}
}
			
		
