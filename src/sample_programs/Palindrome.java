package sample_programs;
public class Palindrome 
{

	public static void main(String[] args) 
	{
	   int  num=121;
	   int oldNum=num;
	   int sum=0;
	   while(num!=0)
	   {
		   int temp=num%10;
		   sum=temp+(sum*10);
		   num=num/10;
	    }
	
	   if(oldNum==sum)
	   {
		   System.out.println("The number "+oldNum+" is a palindrome");
		   
		   
	   }
	   else
	   {
		   System.out.println("The number "+oldNum+" is not a palindrome");
	   }
	
	}

}
