import  java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*------Arrays List Creation----*/


public class Arraylist {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer>demo= new ArrayList<>();
        int size=scan.nextInt();
        for(int i=0;i<size;i++)
        {

        }

        demo.add(6);
        demo.add(2);
        demo.add(3);
        for(int i=0;i<demo.size();i++)
        {
            System.out.print(demo.get(i));
        }

        demo.set(2,4);
        int n2=demo.remove(1);
        System.out.println(n2);

        int size1=demo.size();
        System.out.println(size1);

        demo.sort(Comparator.naturalOrder());
        System.out.println(demo);
    }
}
