package sample_programs;

import java.util.Scanner;

public class Prime_no_withinRange {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the starting range");
		int StartingRange=scan.nextInt();
		System.out.println("enter ending range");
		int EndingRange=scan.nextInt();
		System.out.println("the prime number between "+StartingRange+" to " +EndingRange);
		for(int num=StartingRange; num<=EndingRange; num++)
		{
			boolean flag=false;
			for(int i=2; i<=num-1; i++)
			{
				if(num%i==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(num);
			}
		}
		scan.close();

	}

}
