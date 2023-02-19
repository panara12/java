import java.util.Scanner;

class quitedemo{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vowel = 0 , count = 0;
		char ch;

		System.out.print("Enter Your String : ");
		String str = sc.nextLine();

		while(!str.equals("quite")){

			System.out.print("Enter Your String : ");
			 str = sc.nextLine();

			for(int i = 0; i < str.length(); i++){

				ch = str.charAt(i);

				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

					vowel++;
				}

			}
				count++;
	}

		System.out.println("No Of vowel : " +vowel);
		System.out.println("count : " +count);
	}
}