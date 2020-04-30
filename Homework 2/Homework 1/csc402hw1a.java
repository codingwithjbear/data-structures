package csc402hw1a;

import java.text.DecimalFormat;
import java.util.Scanner;

public class hw1a {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter two floating point numbers separated by a space: ");
		double[] a = new double[2];
		a[0] = input1.nextDouble();
		a[1] = input1.nextDouble();
		
		DecimalFormat df = new DecimalFormat("###.##");

		System.out.println("Sum of the two numbers (A + B): " + df.format((a[0] + a[1])));
		System.out.println("The difference of the two numbers (A - B): " + df.format((a[0] - a[1])));
		System.out.println("The quotient A/B: " + df.format(a[0] / a[1]));
		System.out.println("The quantity: " + df.format(Math.pow(a[0], a[1])));
		
	
		
	}

}
