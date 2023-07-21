import java.util.Scanner;

public class spynum
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int sum=0;
        int pro=1;
        int num;


        while(n>0)
        {
            num = n % 10;
            sum = sum + num;
            pro = pro * num;
            n = n / 10;
            System.out.println(n);
            System.out.println(sum);
            System.out.println(pro);
            if(sum==pro)
        {
            System.out.println("it's a spy number");
        }
            else
        {
            System.out.println("not a spy number");
        }

        }

    }
}
