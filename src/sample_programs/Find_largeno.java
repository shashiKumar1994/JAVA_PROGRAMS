package sample_programs;

public class Find_largeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int larg=10;
		int arr [] ={10,20,30,40,50,100,400,40};
		for(int i=1; i<arr.length;i++)
		{
			if(larg<arr[i])
			{
				larg=arr[i];
			}
		}
		System.out.println("largest number is="+larg);


	}

}
