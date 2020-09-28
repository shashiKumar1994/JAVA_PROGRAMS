package practice;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hai Good Morning";
		String[] str=s1.split(" ");
		String rev_str="";
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			String rev_word="";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev_word=rev_word+word.charAt(j);
			}
			rev_str=rev_str+rev_word+" ";
		}
		
		System.out.println(rev_str);

	}

}
