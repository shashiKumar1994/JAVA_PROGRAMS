package practice_numbers;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1=0;
		int fib2=1;
		int fib3;
		for(int i=1;i<=10;i++)
		{
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}

	}

}
