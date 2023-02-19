import java.util.Scanner;
public class circle{
    static void obj1(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double circle = 3.14*r*r;
        System.out.println (circle);
    }
public static void main(String []args){
    System.out.println("enter circle reduse");
    circle obj1 = new circle();
    obj1();
}
}