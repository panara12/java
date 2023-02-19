public class ComplexDemo
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex();
        Complex c2 = new Complex(3,2);
        Complex c3 = new Complex();

        c1.display();
        c2.display();
        c3.add(c1,c2);
    }
}
