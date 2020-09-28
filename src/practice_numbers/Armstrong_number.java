package practice_numbers;

public class Armstrong_number {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num=153;
		 int sum=0;
		 int num_copy=num;
		
	while(num!=0)
	{
		int rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
		
		
	}
	System.out.println(sum);
	if(num_copy==sum)
	{
		System.out.println("Armstrong");
	}else {
		System.out.println("not Armstrong");
	}
	

	}

}
