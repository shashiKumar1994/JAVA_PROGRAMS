package sample_programs;

public class RemovDuplicateNumbersFrmArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[]={12,15,1,98,12,7,98,56,15};
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]==(arr[j]))
						{
							arr[j]=0;
						}
					}
				}
			}
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					System.out.print(arr[i]+" ");
				}
			}

	}

}
