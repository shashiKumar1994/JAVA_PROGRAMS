package sample_programs;

class Cola
{
	int f=20;
}

class Doremann extends Cola
{
	int d=40;
	void disp()
	{
		System.out.println("CASTING");
	}
}

public class Main {

	public static void main(String[] args) {
		// UPCASTING
		Cola c1=new Doremann();
		System.out.println(c1.f);
		//DOWNCASTING
		Doremann d1=(Doremann) c1;
		System.out.println(d1.d);
		d1.disp();
	}

}
