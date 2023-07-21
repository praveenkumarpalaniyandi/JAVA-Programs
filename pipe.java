import java.util.Scanner;

public class pipe
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Incoming Pipes :");
        int income=scan.nextInt();
        System.out.printf("Outgoing Pipes :");
        int outgo=scan.nextInt();
        System.out.printf("Enter Rust :");
        int rust=scan.nextInt();

        int a[]=new int[income];
        for(int i=0;i<income;i++)
        {
            a[i]= scan.nextInt();
        }
        int b[]=new int[outgo];
        for(int i=0;i<outgo;i++)
        {
            b[i]= scan.nextInt();
        }
        int i=a[0]+a[1]+a[2];
        int o=b[0]+b[1]+b[2];
        int res=(i-o)+rust;
        if(i>o)
        {
            System.out.println("-"+res);
        }
        else
        {
            System.out.println(res);
        }
    }
}
