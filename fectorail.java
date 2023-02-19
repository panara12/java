import java.util.Scanner;
/*class  fact{
    public int number(int no){
        int ans=1;
        for(int i=1;i<=no;i++){
            ans = ans*i;
        }
        return ans;
    }
}
public class fectorail{
    public static void main(String[] args) {
        int no;
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        fact ob = new fact();
        int ans = ob.number(no);
        System.out.println("ans is "+ans);

    }
}*/
public class fectorail{
    static int number(int no){
        int ans=1;
        for(int i=1;i<=no;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int no;
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        int ans = fectorail.number(no);
        System.out.println("ans is "+ans);
    }
}