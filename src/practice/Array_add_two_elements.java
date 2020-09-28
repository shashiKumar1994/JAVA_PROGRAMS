package practice;

public class Array_add_two_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int[] arr= {10,20,6,72,15};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])%5==0)
				{
					count++;
					
				
					
					System.out.println(arr[i] +"  "+ "  " + arr[j]  );
				}
			
				
			}
		
			
		}
		System.out.println(count);
		
	}

}
