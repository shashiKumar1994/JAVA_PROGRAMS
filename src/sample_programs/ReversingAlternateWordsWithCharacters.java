package sample_programs;

public class ReversingAlternateWordsWithCharacters {

	public static void main(String[] args) 
	 {
	   String s1="Manual Sql Java Selenium";
	   String[] s2=s1.split(" ");
	   
	   for(int i=0;i<s2.length;i++)
	   {
		   if(i%2==1)
		   {
			   String temp=s2[s2.length-1];
			   s2[s2.length-1]=s2[i];
			   s2[i]=temp;
		   }
	   }
	   for(int i=0;i<s2.length;i++)
	   {
		  
		String rev;
		if(i%2==1)
		{
			rev=s2[i];
			for(int j=rev.length()-1;j>=0;j--)
				{
					System.out.print(rev.charAt(j));
				}
			System.out.print(" ");
		}
		else
			System.out.print(s2[i]+" ");
	   }
	 }

}
