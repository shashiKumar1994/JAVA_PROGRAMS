package sample_programs;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="selenium";
		 String s2="";
		 
		 for(int i=0;i<s1.length();i++)
		 {
			 boolean b=false;
			 
			 for(int j=0;j<s2.length();j++)
			 {
				 if(s1.charAt(i)==s2.charAt(j))
				 {
					 b=true;
					 break;
				 }
			 }
			 if(b==false)
			 {
				 s2=s2+s1.charAt(i);
			 }
		 }
		 System.out.println(s2);

	}

}
