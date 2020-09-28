package sample_programs;

import java.util.HashMap;

public class Maps_count_words {

	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String s1 = sc.nextLine();*/
		String s1 ="once upon a time in india there was a deer in india";
		String[] arr = s1.split(" ");
		HashMap<String, Integer> a1 = new HashMap<>();	
		System.out.println("B4");
		System.out.println(a1);
		for (String a2 : arr) 
		{
			if (a1.containsKey(a2))
			{
				a1.put(a2, a1.get(a2)+1);
			} else 
			{
				a1.put(a2, 1);
			}
		}
		System.out.println(a1);
	}
}


