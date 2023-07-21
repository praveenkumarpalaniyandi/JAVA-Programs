import java.io.PrintStream;
import java.util.Scanner;

public class movie {
    public static void main(String[]args)
    {
        String name;
        Scanner scan2=new Scanner(System.in);
        name="appu";
        String name2=scan2.nextLine();
        String name3=scan2.nextLine();
        String name4=scan2.nextLine();

        if(name.equals(name2))
        {
            System.out.println("Thunivu");
        }
        else if(name.equals(name3))
        {
            System.out.println("xxxxx");
        }
        else
        {
            System.out.println("Varisu");
        }
    }
}