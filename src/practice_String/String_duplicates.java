package practice_String;

public class String_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MALAYALAM";
		char[] a=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
