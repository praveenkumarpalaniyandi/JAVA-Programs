import java.util.Scanner;

public class sumofzero
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextByte();
        }
        for(int i=0;i<n;i++)
        {
//            System.out.print(arr[i]);
            if(arr[i]+arr[i+1]==0)
            {
                System.out.println(arr[i] &arr[i+1]);
            }
        }

    }
}
