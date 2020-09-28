package sample_programs;

import java.util.Scanner;

public class Armstrong {

	
		/*public static int sumOFCubeOfDigits(int num)
		{
			int sum=0;
			int rem;
			while(num!=0)
			{
				rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			}
			return sum;
			}
			public static void CheckAtg(int num , int sum)
			{
				System.out.println("the number is ="+num);
				System.out.println("the sum is="+sum);
				if(num==sum)
				{
					System.out.println("the number is armstrong");
				}
				else
				{
					System.out.println("the number is not a armstrong");
				}
			}
			public static void main(String [] args)
			{
				int num=444;
				int sum=Armstrong.sumOFCubeOfDigits(num);
				Armstrong.CheckAtg(num, sum);
			}

	}*/
	
 public static void main(String[] args)
 {
	 int sum=0;
	 int rem;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the no");
	 int act_no=sc.nextInt();
	
	 int num=act_no;
	 while(num!=0)
	 {
	 rem=num%10;
	 sum=sum+(rem*rem*rem);
	 num=num/10;
	 }
	 if(act_no==sum)
	 {
		 System.out.println("armstrong");
	 }
	 else
	 {
		 System.out.println("not armstrong");
	 }
	 }
 }

