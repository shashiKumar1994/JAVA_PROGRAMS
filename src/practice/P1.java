package practice;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hai Good Morning";
		String[] str=s1.split(" ");
		String s2="";
		for(int i=0;i<str.length;i++)
		{
			if(i%2!=0)
			{
				String word=str[i];
				String rev_word="";
				for(int j=word.length()-1;j>=0;j--)
				{
					rev_word=rev_word+word.charAt(j);
				}
			s2=s2+rev_word+" ";
			}else {
				String word1=str[i];
				String normal_word="";
				for(int j=0;j<word1.length();j++)
				{
					normal_word=normal_word+word1.charAt(j);
				}
				s2=s2+normal_word+" ";
			}
		}
System.out.println(s2);
	}

}
