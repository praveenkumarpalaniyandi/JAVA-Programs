import java.util.Scanner;

public class maxloss
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        int loss=0;
        int current;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                current = a[i] - a[j];
                if (current > loss) {
                    loss = current;
                }
               // System.out.println(current);
            }


        }
        System.out.print("loss is :"+loss);


    }
}