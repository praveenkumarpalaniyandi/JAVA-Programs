import java.util.*;

class box30 {
    int length;
    int breath;
    int area;
}
class boxdemo2{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        box30 my=new box30();
        my.length=scan.nextInt();
        my.breath=scan.nextInt();
        my.area= my.length * my.breath;

        System.out.print(my.area);
    }
}




// to write a java program to rect,tri,and circle by using separate classes for every shape and also separate class
//