abstract class vegetable
{
    public class Potato
    {
        void display()
        {
            System.out.println("Potato");
            System.out.println("White");
        }
    }

    public class Brinjal
    {
        void display()
        {
            System.out.println("Brinjal");
            System.out.println("Purple");
        }
    }

    public class Tomato
    {
        void display()
        {
            System.out.println("Tomato");
            System.out.println("Red");
        }
    }

}
public class VEGRTABLE
{
    public static void main(String[] args)
    {
        vegetable v = new Potato();
        v.display();
    }
}
