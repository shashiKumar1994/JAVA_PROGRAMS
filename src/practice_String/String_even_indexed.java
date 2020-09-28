package practice_String;

public class String_even_indexed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MALAYALAM";
		
		
		/*char[] a = s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
		}*/
		
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(s1.charAt(i));
			}
		}

	}

}
