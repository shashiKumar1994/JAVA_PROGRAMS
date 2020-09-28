package practice;

public class Array_max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,6,72,15};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		

	}

}
