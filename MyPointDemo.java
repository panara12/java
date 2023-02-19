public class MyPointDemo
{
    public static void main(String[] args)
    {
        MyPoint mp1 = new MyPoint();
        MyPoint mp2 = new  MyPoint(1,1);

        System.out.println(mp1.distance(mp2));
        System.out.println(mp1.distance(1, 0));
    }
}
