package practice;

public class Array_duplicates_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,6,20,6,72,6,15};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					
					arr[j]=0;
	
				}
		}
			if(arr[i]!=0)
			{
				System.out.println(arr[i]);
			}
			}

	}

}
