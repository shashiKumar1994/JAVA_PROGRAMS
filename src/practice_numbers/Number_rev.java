 package practice_numbers;

public class Number_rev {
	
	static int rev;
	static int num=37;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		while(num!=0)
		{
			 int rem=num%10;
			 rev=rev*10+rem;
			 
			 num=num/10;
			
		}
		System.out.println(rev);
		if(rev==num)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not a palindrome ");
		}

	}

}
