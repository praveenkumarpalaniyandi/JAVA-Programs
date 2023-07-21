import java.util.Scanner;

public class demo
{
    public static void ain(String[]args)
    {
        Scanner scan1=new Scanner(System.in);
        int a=scan1.nextInt();
        int sum=0;

        System.out.println("the value is:"+a);
        if(a%3==0)
        {
            System.out.println("is divisible ");
            for(int i=0;i<3;i++)
                sum=sum+a;
            System.out.println("The sum is:"+sum);
        }
        if(sum>=0 && sum<100)
        {
            System.out.println(""+(sum%10));
        }
        else if(sum>=100 && sum<999)
        {
            System.out.println(""+(sum%100));
        }
        else if(sum>=1000 && sum<9999)
        {
            System.out.println(""+(sum%1000));
        }
        else
        {
            System.out.println("is not divisible");
        }

    }
}