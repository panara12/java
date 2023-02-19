 import java.util.Scanner;

interface transport{

	void deliver();

}

abstract class animal{

	abstract void animal1();		

}

class tiger extends animal{

	public void animal1(){

		System.out.println("Tiger Animal Is Calling");

	}	
}


class camel extends animal implements transport{

	public void animal1(){

		System.out.println("Camel Class Is Calling");

	}	

	public void deliver(){

		System.out.println("Camel Deliver");

	}
}

class deer extends animal{

	public void animal1(){

		System.out.println("Deer Animal Is Calling");

	}	
}

class donkey extends animal implements transport{

	public void animal1(){

		System.out.println("Donkey Class Is Calling");

	}	

	public void deliver(){

		System.out.println("Donkey Deliver");
	}

}
 class abst3demo{

 	public static void main(String[] args) {

 		tiger t = new tiger();
 		camel c = new camel();
 		deer de = new deer();
 		donkey dok = new donkey();

 		t.animal1();
 		c.deliver();
 		de.animal1();
 		dok.deliver();

 		
 	}

 }