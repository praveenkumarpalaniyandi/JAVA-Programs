import java.util.Scanner;

public class userinput {
    public static void main(String[]args)
    {
        Scanner scan1=new Scanner(System.in);
        int a=scan1.nextInt();
        int b=scan1.nextInt();
        int c=a+b;
        int sum=0;

        System.out.println("the value is:"+c);
        if(c%3==0)
        {
            System.out.println("is divisible ");
            for(int i=0;i<3;i++)
              sum=sum+c;
              System.out.println("The sum is:"+sum);
        }
        if(sum<10)
        {
            System.out.println("0");
        }
        else if(sum>=10 && sum<100)
        {
            System.out.println(""+(sum%10));
        }
        else if(sum>=100)
        {
            System.out.println(""+(sum%100));
        }
        else
        {
            System.out.println("is not divisible");
        }

    }
}
