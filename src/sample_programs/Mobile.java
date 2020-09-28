package sample_programs;

public class Mobile {
	int Mobile_cost;
	String Mobile_name;
	String Mobile_colour;

	public Mobile(int a,String b,String c) {
		Mobile_cost=a;
		Mobile_name=b;
		Mobile_colour=c;
		
	}

	public static void main(String[] args) {
		Mobile m1=new Mobile(5000, "oneplus","charcoal_black");
		System.out.println(m1.Mobile_cost);
		System.out.println(m1.Mobile_name);
		System.out.println(m1.Mobile_colour);
		
	}

}
