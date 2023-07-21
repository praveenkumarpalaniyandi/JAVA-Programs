import java.util.Scanner;

public class threshold
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=8;
        int count=0;
        int n=scan.nextInt();
        int a[]=new int[10];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]<a[j]&&a[j]<a[k]&&a[i]+a[j]+a[k]<=t)
                    {
                        count++;
                    }
                }
            }

        }
        System.out.println(count);

    }
}
