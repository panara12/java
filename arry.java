import java.util.Scanner;
class frist{
    int number(int n){
        int[] a=new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(a[n]);
        int[] b= new int[n];
        for(int i =0 ; i<n;i++){
            b[i] = a[i];        
        }
        int replace = sc.nextInt();
        int replacewith = sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==replace){
                a[i]=replacewith;
            }
        }
        return a[n];
    }
}
class arry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int[] ans=new int[no];
        frist ob = new frist();
        ans[no]=ob.number(no);
        for(int i=0;i<no;i++){
            System.out.println(ans[i]);
        }
    }
}