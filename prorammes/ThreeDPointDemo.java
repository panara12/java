public class ThreeDPointDemo
{
    public static void main(String[] args)
    {
        ThreeDPoint t1 =new ThreeDPoint();
        ThreeDPoint t2 =new ThreeDPoint(1,3,2);

        System.out.println(t1.distance(t2));
        System.out.println(t1.distance(10,30,(int) 25.5));

    }
   
}
