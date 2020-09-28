package practice_numbers;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=28;
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("perfect number");
		}else
		{
			System.out.println("Not a perfect number");
		}

	}

}
