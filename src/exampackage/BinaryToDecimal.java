package exampackage;

import java.util.Scanner;

public class BinaryToDecimal 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary number");
		int binary=sc.nextInt();
		int decimal=0,power=1;
		while(binary>0)
		{
			int rem = binary%10;
			decimal=(rem*power)+decimal;
			binary=binary/10;
			power=power*2;	
		}
		System.out.println(decimal);

	}

}
