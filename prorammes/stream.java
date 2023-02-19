import java.util.Scanner;

class stream{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The String For Pattern : ");
		String input = sc.nextLine();

		input = input.trim();

		String b ="";

		for(int i = 0; i < input.length(); i++){

			if(input.charAt(i)==' '){


			}

			else{

				b = b+input.charAt(i);

			}
		}

		input = b;


		for(int i = 0; i < (input.length()); i++){


			for(int j =(input.length()- 1); j >= i ; j--){

				System.out.print(" ");

			}

			for (int k = 0; k <=i; k++ ) {

				System.out.print(input.charAt(k) + " ");
				
			}

			System.out.println(" ");
		}

	}
}