import java.util.Scanner;

public class pattern2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int alphabet=65;
        int n=scan.nextInt();


       /* for (int i = 0; i <n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            alphabet++;
            System.out.println();
        }*/


        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char) alphabet+" ");
            }
            alphabet++;
            System.out.println();
        }*/

        for (int i = 0; i <n; i++)
        {
            int alphaabet = 65;
            for (int j = 0; j <=i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--)
        {
            int alphaabet = 65;
            for (int j = 0; j <= i - 1; j++)
            {
                System.out.print((char) alphabet  + " ");
            }
            alphabet++;
            System.out.println();
        }

    }
}
