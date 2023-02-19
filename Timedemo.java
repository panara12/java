public class TimeDemo
{
    public static void main(String[] args)
    {
        Time t1 = new Time();
        Time t2 = new Time();

        t1.display();
        t2.getter();
        t2.display();

        Time t3 = new Time();
        Time t4 = new Time();

        t4.getter();
        t3.getter();
        t4.addtime(t3,t4);
    }
}
