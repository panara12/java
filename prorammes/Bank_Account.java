import java.util.Scanner;
public class Bank_Account
{
    long accountNo;
    String username;
    String email;
    String accountType;
    double accountBalance;
    Scanner input = new Scanner(System.in);

    void getAccountDetails()
    {
        System.out.print("Please enter account no: ");
        accountNo = input.nextInt();
        System.out.print("Please enter username: ");
        username = input.next();
        System.out.print("Please enter email: ");
        email = input.next();
        System.out.print("Please enter account type: ");
        accountType = input.next();
        System.out.print("Please enter Balance: ");
        accountBalance = input.nextDouble(); 
    }

    void displayAccountDetails()
    {
        System.out.println("account No = "+accountNo);
        System.out.println("username = "+username);
        System.out.println("email = "+email);
        System.out.println("account type = "+accountType);
        System.out.println("account Balance = "+accountBalance);
    }
}
