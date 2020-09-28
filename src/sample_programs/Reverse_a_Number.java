package sample_programs;

public class Reverse_a_Number {
	public static void reverse(int num)
	 {
		int rem;
		while(num!=0)
		 {
			rem=num%10;
			System.out.print(rem);
			num=num/10;
		 }
		System.out.println();
	 }
	public static void main(String [] args)
	 {
		Reverse_a_Number.reverse(123);
	 }

}
