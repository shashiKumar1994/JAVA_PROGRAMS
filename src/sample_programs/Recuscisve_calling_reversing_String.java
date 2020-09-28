package sample_programs;

public class Recuscisve_calling_reversing_String 
{
	static int count = 0;
	static void add(String s1)
	{
		if (s1.length()>1)
		{
			System.out.print(s1.substring(s1.length()-1));
			add(s1.substring(0,s1.length()-1));
		}
		else
		{
			System.out.print(s1.substring(s1.length()-1));
		}
	}
	public static void main(String[] args) 
	{
		add("the java");
	}
}                                 
