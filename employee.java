 import java.util.*;

class emp
{
    void disp1()
    {
        Scanner scan=new Scanner(System.in);
        String name= scan.nextLine();
        String add=scan.nextLine();
        int num=scan.nextInt();
        int id= scan.nextInt();
        System.out.println("name:"+name);
        System.out.println("address:"+add);
        System.out.println("phn num:"+num);
        System.out.println("id:"+id);


    }
}
public class employee
{
    public static void main(String[]args)
    {
        emp a=new emp();

        a.disp1();
    }
}
