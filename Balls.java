import java.util.Scanner;

public class Balls
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int j=1;
            if(arr[i]==arr[j])
            {
                j++;

            }
            else
            {
                System.out.println("b-"+i+"is defective");
            }
        }
    }
}