import java.util.Scanner;

public class Test {
    public static void main(String[]args)
    {
        int a=1;
        int b=1;
        int c=a+b;
        int i=2;

        Scanner scan1=new Scanner(System.in);
        int N=scan1.nextInt();

        while (i<N)
        {
            c=a+b;
            a=b;
            b=c;
            i++;

            System.out.println(c);

        }




    }
}
