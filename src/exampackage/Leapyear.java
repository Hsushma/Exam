package exampackage;

import java.util.Scanner;

public class Leapyear 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int n=sc.nextInt();
		if((n%4==0 && n%100!=0)||n%400==0)
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}

}
