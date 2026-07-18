import java.io.*;

class PrimeNumber{

	public static void main(String args[]){
		Console c = System.console();
		boolean isPrime = true;
		int num = Integer.parseInt(c.readLine("Enter a number to check the prime : "));
		if(num <= 1)
			isPrime = false;
		else
			for(int i = 2; i < num ; i++){
				if(num % i == 0){
					isPrime = false;
					break;
				}
			}

			if(isPrime)
				System.out.println("The number " + num + " is a prime number.");
			else
				System.out.println("The number " + num + " is not a prime number.");
	}
}
			
		
