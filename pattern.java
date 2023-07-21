import java.util.Scanner;

public class pattern
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int b=s.nextInt();
        int[][] arr=new int[n][b];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
