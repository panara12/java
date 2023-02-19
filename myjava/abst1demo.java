import java.util.Scanner;
abstract class vegetable{

	String color = " ";

	abstract void tostring();

}

class potato extends vegetable{

	void tostring(){

		System.out.println("Like White");

	}
}

class tomato extends vegetable{

	void tostring(){

		System.out.println("Like Red");

	}

}


class brinjal extends vegetable{

	void tostring(){

		System.out.println("Like Purple");

	}

}

class abst1demo{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		vegetable ve = null;


		System.out.println("Enter Your Vegetable");
		String input = sc.next();

		switch(input){

		case "potato":

				 ve = new potato();

		break;	


		case "tomato":

				 ve = new tomato();
				
		break;	


		case "brinjal":

				 ve = new brinjal();
				
		break;		

		}

		ve.tostring();

		System.out.println("Thank You");
		
	}
}