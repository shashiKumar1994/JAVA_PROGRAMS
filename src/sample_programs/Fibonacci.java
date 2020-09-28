package sample_programs;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fib1=0;
		int fib2=1;
		int limit=50;
		int fib3;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=2; i<10; i++)
		{
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}


	}

}
