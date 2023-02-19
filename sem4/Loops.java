import java.util.concurrent.TimeUnit;

public class Loops {
    public static void main(String[] args) {
        int i =10;
        // while (i<5) {
        //     System.out.println(i);
        //     ++i;
        // }
        // System.out.println("do while");
        // do {
        //     System.out.println(i);
        //     ++i;
        // } while (i<4);
        // System.out.println("for");
        // for (int j = 0; j < i; j++) {
        //     System.out.println(j);
        // }
        int[] a ={10,20,30,40};
        for (int j : a) {
            System.out.println(j);
        }
        for (int j = 0; j < 10; j++) {
            if (j==8) {
                continue;
            }
            System.out.println(j);
        }
    }
}
