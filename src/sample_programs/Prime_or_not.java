package sample_programs;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("its prime");
		}
		else
		{
			System.out.println("its not a prime");
		}
	}

}
