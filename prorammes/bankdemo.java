import java.util.Scanner;

class bank_acount{

	int actno;
	String user_name;
	String email;
	String act_type;
	int act_balance;

	void setdata(){

		Scanner sc = new Scanner(System.in);

	System.out.println("Enter the User Name");
	user_name = sc.next();	

	System.out.println("Enter the Account Number");
	actno = sc.nextInt();

	System.out.println("Enter the Email");
	email = sc.next();

	System.out.println("Enter the Account Type");
	act_type = sc.next();

	System.out.println("Enter the User Name");
	act_balance = sc.nextInt();


	}

	void getdata(){


	}

}


public class bankdemo{

	public static void main(String[] args) {
			
		bank_acount obj = new bank_acount();

		obj.setdata();
		obj.setdata();

	}
}