package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("We will find all prime numbers up to a certain number.");
		System.out.print("Enter the number we will use: ");
		int n = scanner.nextInt();
		
		boolean[] prime = new boolean[n];
		for (int ma = 0; ma < prime.length; ma++) {
			prime[ma] = true;
		}
		
		for(int count = 1; count < n; count ++) {
			int i = 2; //number we are dividing everything by
			while(i < count-1) {
				if (count % i == 0) {
					prime[count] = false;
					
				}
				
				i++;
			}
			
			if(prime[count]) {
				System.out.println(count);
			}
		}
		
		
		
	}

}
