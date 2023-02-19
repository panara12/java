public class ThreeDPoint
{
    int x;
    int y;
    double z;

    ThreeDPoint()
    {
        x=0;
        y=0;
        z=0;
    }

    double getz()
    {
        return this.z;
    }

    ThreeDPoint(int x,int y,double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    double distance(ThreeDPoint th)
    {
        double distance = Math.sqrt(Math.pow((this.x-th.x),2)+Math.pow((this.y-th.y),2));
        return distance;
    }

    double distance(int x,int y,int z)
    {
        double distance = Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
        return distance;
    }
}
