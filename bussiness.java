import java.util.Scanner;

class buss{

	String bussiness_name;
	String bussiness_type;
	String city;
	int bussiness_id;

	void setdata(){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Bussiness Name : ");
		bussiness_name = sc.next();

		System.out.print("Enter The Type Bussiness : ");
		bussiness_type = sc.next();

		System.out.print("Enter The city Name : ");
		city = sc.next();

		System.out.print("Enter The Bussiness Id Name : ");
		bussiness_id = sc.nextInt();
	}


	void getdata(){

		System.out.print("The Bussiness Name : " +bussiness_name);
		System.out.print("The Type Bussiness : " +bussiness_type);
		System.out.print("The city Name : " +city);
		System.out.print("The Bussiness Id Name : " +bussiness_id);

	}
}


class bussiness{

	public static void main(String args[]){

		buss ac = new buss();


	}
}