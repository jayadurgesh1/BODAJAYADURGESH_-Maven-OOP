package com.epam_task;
import java.util.*;
public class chocolates extends sweets
{
	String[] chocolate_name;
	int[] chocolate_flavor;
	int[] chocolate_cost;
	public void chocolates()
	{
		Scanner so =new Scanner(System.in);
		System.out.println("enter no. of items you add");
		int size111=so.nextInt();
		String[] chocolate_name = new String[size111];
		int[] chocolate_flavor = new int[size111];
		int[] chocolate_cost = new int[size111];
		for(int i=0;i<size111;i++)
		{
			System.out.println("enter chocolate name");
			chocolate_name[i]=so.next();
			System.out.println("enter chocolate flavor");
			chocolate_flavor[i]=so.nextInt();
			System.out.println("enter chocolate cost");
			chocolate_cost[i]=so.nextInt();
		}
		for(int i=0;i<chocolate_cost.length-1;i++)
		{
			for(int j=0;j<chocolate_cost.length-i-1;j++)
			{
				if(chocolate_cost[j]>chocolate_cost[j+1])
				{
					int temp=chocolate_cost[j];
					chocolate_cost[j]=chocolate_cost[j+1];
					chocolate_cost[j+1]=temp;
					String tem=chocolate_name[j];
					chocolate_name[j]=chocolate_name[j+1];
					chocolate_name[j+1]=tem;
					int te=chocolate_flavor[j];
					chocolate_flavor[j]=chocolate_flavor[j+1];
					chocolate_flavor[j+1]=te;
				}
			}
		}
		
		System.out.println("chocolate details:\nchocolate name\tchocolate weight\tchocolate cost");
		display1(chocolate_name,chocolate_flavor,chocolate_cost);
		System.out.println("Enter sweets details");
		sweets();
	so.close();
	}
	void display1(String[] a,int[] b,int[] c)
		{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
		}
		}
}
