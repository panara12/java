import java.util.Scanner;
public class Complex
{
    Scanner input = new Scanner(System.in);
    int real;
    int img;

    Complex()
    {
        real = 34;
        img = 2;
    }

    Complex(int real,int img)
    {
        this.real = real;
        this.img = img;
    }

    void display()
    {
        System.out.println("Roots:");
        System.out.println(real+"+"+"i"+img);
    }

    void add(Complex c1, Complex c2 )
    {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        System.out.println(temp.real+"+"+"i"+temp.img);
    }
}
