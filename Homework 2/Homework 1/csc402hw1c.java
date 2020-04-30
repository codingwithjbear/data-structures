package csc401hw1c;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw1c {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		List<Double> gpaNumbers = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter GPA values: ");
		double x = 0;
		
		do {
			x = input.nextDouble();
			gpaNumbers.add(x);
		} while(x >= 0);
		
		gpaNumbers.remove(gpaNumbers.size() - 1); // removes the non valid GPA value
		
		System.out.println("The number of valid GPAs entered: " + gpaNumbers.size());
		System.out.println(gpaNumbers);
		
		//sum of GPAs
		double total = 0;
		for (int i =0; i < gpaNumbers.size(); i++) 
			{
				total += gpaNumbers.get(i);
			}
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println("The sum of the GPAs: " + df.format(total));
		System.out.println("The average GPA: " + df.format(total/gpaNumbers.size()));
	}
}

