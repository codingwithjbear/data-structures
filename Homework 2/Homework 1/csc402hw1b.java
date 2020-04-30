package csc402hw1b;

import java.util.Scanner;

public class hw1b {
	public static void main(String[] args) {
		int x = 0;
		int i = 2;
		 
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a positive integer 'N': ");
		int j = input.nextInt();
		int c = j;
		int y = 0;
		 
		 
		do {
			y = c/i;
			c = y;
			System.out.println(y);
			x++;
			} while (y != 1);
		 
		 System.out.println("Number of iterations required: " + x);
		 System.out.println("The value of log2(N): " + (Math.log(j)/Math.log(2)));
		 }
}
