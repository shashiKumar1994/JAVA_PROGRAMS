package practice_numbers;

public class Prime_or_not {

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
				System.out.println("prime");
			}else {
				System.out.println("Not prime");
			}
		}

	}



