package com.epam_task;
import java.util.*;
public class sweets
{
	String[] sweet_name;
	int[] sweet_weight;
	int[] sweet_cost;
	public void sweets()
	{
		Scanner st =new Scanner(System.in);
		System.out.println("enter no. of items you add");
		int size1=st.nextInt();
		String[] sweet_name = new String[size1];
		int[] sweet_weight = new int[size1];
		int[] sweet_cost = new int[size1];
		for(int i=0;i<size1;i++)
		{
			System.out.println("enter sweet name");
			sweet_name[i]=st.next();
			System.out.println("enter sweet weight");
			sweet_weight[i]=st.nextInt();
			System.out.println("enter sweet cost");
			sweet_cost[i]=st.nextInt();
		}
		
		System.out.println("sweets details:\nsweet name\tsweet weight\tsweet cost");
		display2(sweet_name,sweet_weight,sweet_cost);
	st.close();
	}
	void display2(String[] a,int[] b,int[] c)
		{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
		}
		}
}
