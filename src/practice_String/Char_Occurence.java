package practice_String;

import java.util.HashMap;
import java.util.Map;

public class Char_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MALAYALAM";
		char[] a=s1.toCharArray();
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(char a1:a)
		{
			if(m.containsKey(a1))
			{
				m.put(a1, m.get(a1)+1);
			}else {
				m.put(a1, 1);
			}
		}
		System.out.println(m);
		
		

	}

}
