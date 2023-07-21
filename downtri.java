import java.util.Scanner;

public class downtri
{
    public static void main(String[]args)
    {
        Scanner scan1=new Scanner(System.in);
        int n= scan1.nextInt();
        int j=scan1.nextInt();
        for(int i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
