import java.util.*;

class rect {
    void display1()
    {
        Scanner scan1=new Scanner(System.in);
        int length=scan1.nextInt();
        int breath=scan1.nextInt();
        int area=length *breath;
        System.out.println(area);
    }

}
class tri
{
    void display2()
    {
        Scanner scan2=new Scanner(System.in);
        int height=scan2.nextInt();
        int base=scan2.nextInt();
        System.out.println(0.5*(height*base));
    }
}
class circle
{
    void display3()
    {
        Scanner scan3=new Scanner(System.in);
        int ratio=scan3.nextInt();
        System.out.println(2*3.14*ratio);
    }
}

public class class1
{
    public static void main(String[] args)
    {
        rect a=new rect();
        tri b=new tri();
        circle c=new circle();

        a.display1();
        b.display2();
        c.display3();
    }
}
