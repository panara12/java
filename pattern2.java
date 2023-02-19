public class pattern2{
    public static void main(String args[]){
    int n =4;
    for(int a=1;a<=n;a++)
    {
        for(int r=(n-1);r>=a;r--)
        {
            System.out.print(" ");
        }
        for(int b=2;b<=a;b++)
        {
          
            System.out.print("*");}
           
        }
        int a;
        for(int w=1;w<=a;w++)
        {
            if(a!=2){
            System.out.print("*");}
             else{
                System.out.print(" ");
                }
        }

        System.out.print("\n");
    }}
}