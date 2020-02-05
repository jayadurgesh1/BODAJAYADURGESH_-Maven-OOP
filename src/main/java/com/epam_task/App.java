package com.epam_task;

public class App extends candy
{
	void run1()
	{
		System.out.println("Enter candies details");
		candy();
	}
	public static void main(String[] args)
	{
		App object1 = new App();
		object1.run1();
	}
}
