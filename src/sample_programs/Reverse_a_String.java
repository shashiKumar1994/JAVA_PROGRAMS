 package sample_programs;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="javadeveloper";
		char[] s2=s1.toCharArray();
		for(int i=s2.length-1; i>=0;i--)
		{
			System.out.println(s2[i]);
		}
		
		/*String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
System.out.println(s2);
*/
	}

}
