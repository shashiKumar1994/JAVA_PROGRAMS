package practice_String;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="KARNATAKA";
		char[] a = s1.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
