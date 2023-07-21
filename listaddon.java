import java.util.ArrayList;


/*------Add demo list to demo2---------*/
public class listaddon{
    public static void main(String[]args)
    {
        ArrayList<Integer>demo= new ArrayList<>();
        ArrayList<Integer>demo2=new ArrayList<>();
        demo.add(1);
        demo.add(2);
        demo.add(3);

        demo2.addAll(demo);

        System.out.println(demo2);
    }
}
