import java.util.Scanner;

class student{

	int roll_no;
	String name;

	public student(int roll_no , String name){

		this.roll_no = roll_no;
		this.name = name;
	}

	void printdata(){

		System.out.println("Name : " + name);
		System.out.println("Roll No : " + roll_no);
	}
}

class arrayofobjectdemo{

	public static void main(String[] args) {

		student [] stu = new student[3];

		stu[0] = new student(0 , "darshan");
		stu[1] = new student(1 , "darshan University");
		stu[2] = new student(2 , "darshan University Rajkot");

		stu[0].printdata();
		stu[1].printdata();
		stu[2].printdata();
		
	}
}