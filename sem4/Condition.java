public class Condition {
    public static void main(String[] args) {
        if(18>10){
            System.out.println("this is good");
        }
        else{
            System.out.println("not good");
        }
        int a=10;
        int b=20;
        System.out.println(
            (a>b)?"a is small":"b is big"
        );
        switch (b) {
            case 2:
                System.out.println("right!!!!!");
                break;
        
            default:
                System.out.println("not right");
                break;
        }
    }
}
