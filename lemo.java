class time{
    int h,m;
    time(){
        h=1;
        m=1;
    }
    time(int a,int b){
        h=a;
        m=b;
    }
    void display(){
        System.out.println("hour="+h);
        System.out.println("min="+m);
    }
    int add(){

    }
}
public class lemo{
    public static void main(String args []){
        time t1 = new time(3,10);
        time t2 = new time(3,20);
        time t3 = new time();
        t1.display();
        t2.display();
        t3.display();
    }
}