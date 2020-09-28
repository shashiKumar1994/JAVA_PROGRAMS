package practice_numbers;

import java.util.Scanner;

public class Print_prime {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the starting range");
		int StartingRange=scan.nextInt();
		System.out.println("enter ending range");
		int EndingRange=scan.nextInt();
		for(int num=StartingRange; num<=EndingRange; num++)
		{
			boolean flag=true;
			for(int i=2; i<=num-1; i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(num);
			}
		}
		scan.close();
	}

}
