import java.util.Scanner;

public class patternjava {
    public static void main(String[]args)
    {
        Scanner scan1=new Scanner(System.in);
        int a=scan1.nextInt();
        int b=a*2-1;

        for(int i=0;i<b;i++)
        {
            for(int j=0;j<2;j++)
            {
                  System.out.print("#");

            }
            for(int j=2;j<9;j++)
            {
                if (i==b/2)
                {
                    System.out.print("$");
                }
                else
                {
                    System.out.print(" ");
                }

                System.out.printf(" ");

            }


            for(int j=9;j<11;j++)
            {
                System.out.print("#");

            }

            System.out.println(" ");


        }
    }
}
