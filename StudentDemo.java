import java.util.Scanner;

class student{

	int roll_no;
	int age;
	String name;

	// void setdata(){

	// 	roll_no = 101;
	// 	name = "smit";
	// 	age = 18;

	// }

	void setdata(){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Roll NO : ");
		roll_no = sc.nextInt();


		System.out.print("Enter The Name : ");
		name = sc.next();

		System.out.print("Enter The Age : ");
		age = sc.nextInt();


	}

	void getdata(){

		// setdata();
		System.out.println("roll_no :" +roll_no);

		System.out.println("name : " +name);

		System.out.println("roll_no : " +age);


	}
}


class studentDemo{

	public static void main(String args[]){


		student s1 = new student();
		student s2 = new student();

		s1.setdata();
		s2.setdata();

		System.out.println("------------Detail------------");

		s1.getdata();
		s2.getdata();

	}
}