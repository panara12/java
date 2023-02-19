public class pettern6{
    public  static void main(String[]args){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5+i;j++){
                if(j<=4-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        for(int a=0;a<=5;a++){
            for(int k=0;k<=5+5-a;k++){
                    if(k<=a+a-1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            System.out.println(" ");
        }
    }
}