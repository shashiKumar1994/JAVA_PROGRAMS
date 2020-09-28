package practice_String;



public class String_swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Hai Hello How Are You";
		String rev_string="";
		String[] s1 = string.split(" ");
		for(int i=0;i<s1.length;i++)
		{
		
			if(i%2!=0)
			{
			String word=s1[i];
			String rev_word="";
			for(int j=word.length()-1;j>=0;j--)
			{
			
				rev_word=rev_word+word.charAt(j);
				
			}
	
			rev_string=rev_string+rev_word+" ";
			}
			else
			{
				String word1=s1[i];
				
		
				rev_string=rev_string+word1+" ";
				}
					
			}
					
		System.out.println(rev_string);
		
	}
}



