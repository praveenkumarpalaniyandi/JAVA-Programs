import java.util.Scanner;

public class water
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        int n=scan.nextInt();
        int arr[]=new int[N];
        int l=arr.length;
        //System.out.println(l);
        for(int i=0;i<l;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum=l-n;
        System.out.println(sum);
        if(arr[0]<arr[5])
        {
            int sum2=arr[0]*sum;
            System.out.println(sum2);
        }
        else
        {
            int sum3=arr[5]*sum;
            System.out.println(sum3);

        }
    }
}
