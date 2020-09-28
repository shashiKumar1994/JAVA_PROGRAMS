package practice_numbers;

public class Prime_or_not1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
		if(count==2)
		{
			System.out.println("plaindrome");
		}else {
			System.out.println("not a palindrome");
		}

	}

}
