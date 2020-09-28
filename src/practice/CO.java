package practice;

import java.util.HashMap;
import java.util.Map;

public class CO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="askdadaskdjfjkdsdfkjekfslkfjs";
		char[] c=s1.toCharArray();
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(char c1:c)
		{
			if(m.containsKey(c1))
			{
				m.put(c1, m.get(c1)+1);
			}else
			{
				m.put(c1, 1);
			}
		}
		System.out.println(m);
	}

}
