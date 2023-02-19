import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0)
        System.out.print("no is prime");
        else
        System.out.print("not prime");
    }
}