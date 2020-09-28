
package practice_String;

public class Chars_in_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="GOOD FRIEND IS NEEDED";
		String s2="";
		String[] arr = s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			//s2=arr[i];
			//System.out.println(s2+ " " + s2.length());
			System.out.println(arr[i]+ " " + arr[i].length());
		}

	}

}
