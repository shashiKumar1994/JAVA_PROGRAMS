package practice_numbers;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int sum=0;
	while(num!=0)
	{
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		
	}
	System.out.println(sum);
	

	}

}
