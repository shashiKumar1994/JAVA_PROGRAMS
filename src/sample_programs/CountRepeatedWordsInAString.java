package sample_programs;

public class CountRepeatedWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Automation Job Java Job Java";
		String[] arr=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]!=null)
				{
					if(arr[i].equals(arr[j]))
					{
						count++;
						arr[j]=null;
					}
				}
			}
			if(arr[i]!=null)
			{
				System.out.println(arr[i]+"-->"+count);
			}
			
		}

	}

}
