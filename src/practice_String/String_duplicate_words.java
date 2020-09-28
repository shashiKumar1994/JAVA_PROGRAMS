package practice_String;

public class String_duplicate_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="GOOD FRIEND IS NEEDED IS NEEDED";
		String[] arr = s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					arr[j]="";
				}
			}
			if(arr[i]!="")
			{
				System.out.println(arr[i]);
			}
		}

	}

}
