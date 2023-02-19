import java.util.Scanner;

interface a{

	String astr = "a_called";

	public void display_a();


}

interface a1 extends a{

	String astr_1 = "a1_called";
	
	public void display_a1();

}

interface a2 extends a{

	String astr_2 = "a2_called";
	
	public void display_a2();

}

interface a12 extends a1,a2{

	String astr_12 = "a12_called";
	
	public void display_a12();	

}

class b implements a12{

	public void display_a(){

		System.out.println(a.astr);

	}


	public void display_a1(){

		System.out.println(a1.astr_1);

	}

	public void display_a2(){

		System.out.println(a2.astr_2);

	}

	public void display_a12(){

		System.out.println(a12.astr_12);

	}

}

class abst2demo{

	public static void main(String[] args) {

		// a aobj = new b();
		// a1 aobj1 = new b();
		// a2 aobj2 = new b();
		// a12 aobj12 = new b();

		// aobj.display_a();
		// aobj1.display_a1();
		// aobj2.display_a2();
		// aobj12.display_a12();


		b aobj = new b();
		b aobj1 = new b();
		b aobj2 = new b();
		b aobj12 = new b();

		aobj.display_a();
		aobj1.display_a1();
		aobj2.display_a2();
		aobj12.display_a12();
		
	}
}