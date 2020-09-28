package sample_programs;

public class Sum_of_digits {
	
	public static void main(String [] args)
	{
		int num=123;
		int sum=0;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("the value of sum is ="+sum);

		
	}

}
