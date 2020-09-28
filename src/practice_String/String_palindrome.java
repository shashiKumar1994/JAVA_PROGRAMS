package practice_String;

public class String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="MADAM";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s2.equals(s1))
		{
			System.out.println("palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
