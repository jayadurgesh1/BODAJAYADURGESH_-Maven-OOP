package com.epam_task;
import java.util.*;

public class candy extends chocolates
{
	String[] candies_name;
	int[] candies_flavor;
	int[] candies_cost;
	public void candy()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter no. of items you add");
		int size=s.nextInt();
		String[] candies_name = new String[size];
		int[] candies_flavor = new int[size];
		int[] candies_cost = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter candy name");
			candies_name[i]=s.next();
			System.out.println("enter candy flavor");
			candies_flavor[i]=s.nextInt();
			System.out.println("enter candy cost");
			candies_cost[i]=s.nextInt();
		}
		System.out.println("candy details:\ncandy name\tcandy weight\tcandy cost");
		display(candies_name,candies_flavor,candies_cost);
		System.out.println("Enter chocolates details");
		chocolates();
	s.close();
	}
	void display(String[] a,int[] b,int[] c)
		{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
		}
		}
}
