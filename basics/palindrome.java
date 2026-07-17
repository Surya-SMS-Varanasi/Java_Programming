import java.io.*;

class PalindromeNumber{

	public static void main(String args[]){
		Console c = System.console();
		
		int num = Integer.parseInt(c.readLine("Enter a number to check the palindrome : "));
		
		int rev = 0, mod, temp = num;
		
		while(num > 0){
			mod = num % 10;
			rev = (rev * 10) + mod;
			num = num / 10;
		}

		if( temp == rev )
			System.out.println("The number " + temp + " is a palindrome number");
		else
			System.out.println("The number " + temp + " is not a palindrome number");
	}
}
			
		
