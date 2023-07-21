import java.util.Scanner;

public class pyramidpattern
{
    public static void printpattern(int n)
    {

        int num=1;
        char c='b';

        for(int i=0;i<=n;i++)
        {
            for(int j=i;j<=i;j++)
            {
                if(j==1)
                {
                    System.out.print(n);
                }
                else
                {
                    System.out.println(c);
                }
            }
            System.out.print(n);
            System.out.print(c);
            System.out.println();
            n++;

            if(c=='f')
            {
                break;
            }
            c++;
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=2;
        printpattern(n);
    }
}
