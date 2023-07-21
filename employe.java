import java.util.Scanner;

class empl
{
    void disp()
    {


        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();
        String name2=scan1.nextLine();
        String name3=scan1.nextLine();
        int year=scan1.nextInt();
        int year2= scan1.nextInt();
        int year3= scan1.nextInt();
        String address = scan1.next();
        String address2 = scan1.next();
        String address3 = scan1.next();


        System.out.println("Name"+"\n"+name+"\n"+name2+"\n"+name3);
        System.out.print("year of joining"+"\n"+year+"\n"+year2+"\n"+year3);
        System.out.println("address"+"\n"+address+"\n"+address2+"\n"+address3);

    }
}







public class employe {
    public static void main(String[]args)
    {
        empl my=new empl();
        my.disp();

    }
}
