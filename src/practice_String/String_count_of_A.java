package practice_String;

public class String_count_of_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s1="KARNATAKA";
		char[] a = s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='A')
			{
				count++;
			}
		}
		System.out.println(s1 + "  " + count );

	}

}
