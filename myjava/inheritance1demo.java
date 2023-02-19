import java.util.Scanner;
class student{

			int id_no;
			int no_of_student_registerd;
			int subjectcode;
			int subjectcrdit;
			String gradeobtain;
			double spi;

	public student(){

			 id_no = 0;
			 no_of_student_registerd = 0;
			 subjectcode = 0;
			 subjectcrdit = 0;
			 gradeobtain = " ";
			 spi = 0.00;

	}			


	public student(int id_no , int no_of_student_registerd , int subjectcode , int subjectcrdit , String gradeobtain , float spi){

			this.id_no = id_no;
			this.no_of_student_registerd = no_of_student_registerd;
			this.subjectcode =  subjectcode;
			this.subjectcrdit = subjectcrdit;
			this.gradeobtain = gradeobtain;
			this.spi = spi;

	}

	void printdata(){

		System.out.println(" -- > ID No : " +id_no);
		System.out.println(" -- > No Of Student Registerd : " +no_of_student_registerd);
		System.out.println(" -- > Subject Code : " +subjectcode);
		System.out.println(" -- > Subject Credit : " +subjectcrdit);
		System.out.println(" -- > Grade : " +gradeobtain);
		System.out.println(" -- > SPI : " +spi);

	}		

}

class inheritance1demo{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("HOw Many Data Of Student Want To Inser : ");
		int userhcoice = sc.nextInt();

		student [] stu = new student[userhcoice];
		student ptdata = new student();

		// simple way to define Array Of Object ----

		// stu[0] = new student(1 , 2 , 123456789 , 4 , 'A' , 9);
		// stu[1] = new student(2 , 3 , 246864248 , 5 , 'A' , 9);
		// stu[2] = new student(3 , 4 , 164475859 , 6 , 'A' , 9);
		// stu[3] = new student(4 , 5 , 145754548 , 7 , 'A' , 9);
		// stu[4] = new student(5 , 6 , 124177179 , 8 , 'A' , 9);

		// user choice in Arry Of Object ----


		for(int i = 0; i <userhcoice; i++){

			System.out.print("Enter The Student ID : ");
			 int input_1 = sc.nextInt();

			System.out.print("Enter The No Of Student : ");
			int input_2 = sc.nextInt();

			System.out.print("Enter The Subject Code : ");
			int input_3 = sc.nextInt();
			
			System.out.print("Enter The Subject Credit : ");
			int input_4 = sc.nextInt();

			System.out.print("Enter The Grade : ");
			String input_5 = sc.next();

			System.out.print("Enter The SPI : ");
			float input_6 = sc.nextFloat();

		stu[i] = new student(input_1 , input_2 , input_3 , input_4 , input_5 , input_6);

		

		System.out.println(" ");
		System.out.println("Enter Next Data ------");
		System.out.println(" ");


		}

		for(int j = 0; j <userhcoice; j++){

		System.out.println(" ");
		System.out.printf(" ----//// Datail Of %d Student //// ---- \n" , j+1);
		System.out.println(" ");
		stu[j].printdata();

		}

		System.out.println("Thank you");

	}
}