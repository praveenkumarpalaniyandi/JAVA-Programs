import java.util.Arrays;
import java.util.Scanner;

public class Ass2
{
    public static void main(String[] args)
    {
        int a[]={3,9,8,7,8,9,4,9,2,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter length:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int b[]={scan.nextInt()};
            Arrays.sort(b);
            System.out.println(Arrays.toString(b));
        }

       // int sum=0;
      //  int min=1;

       /* for(int i=0;i<a.length;i++)
        {
            sum=a[i];
            System.out.print(sum+" ");
            if(sum<=min)
            {
                min=sum;
            }
            if (sum>min)
            {
                sum=0;
            }

        }
        System.out.println(min);*/

        //System.out.println(a[2]);




    }
}
