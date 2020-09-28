package practice_numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Raw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s1="HAI IAM HAI SHASHI IAM FROM BANGALORE FROM";
String[] c=s1.split(" ");
Map<String, Integer> m=new HashMap<String,Integer>();

for(String c1:c)
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
