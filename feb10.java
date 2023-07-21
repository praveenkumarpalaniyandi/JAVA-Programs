import java.util.*;
class people
{
    int id;
    String consumer_name;
    int consumer_num;
    double prev_reading;
    double current_reading;
    String people;
}
public class feb10 {
    public static void main(String[]args)
    {
        Scanner scan1=new Scanner(System.in);
        people my=new people();
        int i=0;
        while(i<2) {
            System.out.println("enter id:");
            my.id=scan1.nextInt();
            System.out.println("enter name:");
            my.consumer_name = scan1.next();
            System.out.println("enter num:");
            my.consumer_num = scan1.nextInt();
            System.out.println("prev_reading:");
            my.prev_reading = scan1.nextDouble();
            System.out.println("current_reading:1");
            my.current_reading = scan1.nextDouble();
            i++;


            my.people = "id :" + my.id + "\n" + "consumer_name :" + my.consumer_name + "\n" + "consumer_num :" + my.consumer_num + "\n" + "prev_reading :" + my.prev_reading + "\n" + "current_reading :" + my.current_reading;

            System.out.println(my.people);
        }
        System.out.println("enter id:"+my.id);
        if(my.id==101)
        {
            System.out.println("consumer_name :" + my.consumer_name + "\n" + "consumer_num :" + my.consumer_num + "\n" + "prev_reading :" + my.prev_reading + "\n" + "current_reading :" + my.current_reading);
        }
        else
        {
            System.out.println("1000");
        }


    }
}
