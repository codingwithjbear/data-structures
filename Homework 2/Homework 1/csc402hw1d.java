package csc402hw1d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw1d {
	
	public static int sumInts(int n) 
	{
		List<Integer> nlist = new ArrayList<Integer>();
		for (int i=n; i > 0; i--)
		{
			nlist.add(i);
		}
		
		int total = 0;
		for (int i = 0; i < nlist.size(); i++) 
			{
				total += nlist.get(i);
			}
		return(total);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int x = input.nextInt();
		for (int i = 1; i <= x; i++)
		{
			System.out.println("The value of M: " + i);
			System.out.println("The result of sumInts(M): " + sumInts(i));
			System.out.println("The value of (M+1)*M/2: " + (i +1) * i/2);
			System.out.println(" ");
		}
	}
}

