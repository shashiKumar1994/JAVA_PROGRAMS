package sample_programs;

public class Convert_into_palindrome {
	public static void main(String[] args) 
	{ 
		
		String s1="emoclew";
		String s2="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("the given string is polindrome");
			
		}
		else
		{
			System.out.println("the given Stirng is not a polindrome");
			String s3=s1+s2;
			
			System.out.println("the original String="+s1);
			System.out.println("the reverse string is="+s2);
			System.out.println("converted to polindrome="+s3);
		}

	}

}
