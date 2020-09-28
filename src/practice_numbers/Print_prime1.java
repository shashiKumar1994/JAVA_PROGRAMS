package practice_numbers;

public class Print_prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sr=2;
		int er=10;
		if(sr!=1)
		{
		for(int num=sr;num<=er;num++)
		{
			Boolean flag=true;
			for(int i=2;i<=num-1;i++)
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
		}

	}

}
