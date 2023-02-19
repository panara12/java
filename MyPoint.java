import java.util.Scanner;
public class MyPoint
{
    Scanner input = new Scanner(System.in);
    int x;
    int y;

    MyPoint()
    {
        x=0;
        y=0;
    }

    MyPoint(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    double distance(MyPoint mp)
    {
        double distance = Math.sqrt(Math.pow(this.x-mp.x,2)+Math.pow(this.y-mp.y,2));
        return distance;
    }

    double distance(int x, int y)
    {
        double distance = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
        return distance;
    }
}
