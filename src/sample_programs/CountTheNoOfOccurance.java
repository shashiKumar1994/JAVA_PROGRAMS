package sample_programs;

public class CountTheNoOfOccurance 
{

	public static void main(String[] args) 
	{
		String rv="dwarknathjjj";
		int count=0;
		for(int i=0;i<rv.length();i++)
		{
			if(rv.charAt(i)=='j')
			{
				count++;
			}
		}
		System.out.println("count= "+count);

	}

}
