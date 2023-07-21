import java.util.Scanner;

public class fibo
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int s=0;
        int n1=1,n2=2;
        for(int i=3;i<n;i++)
        {
            s=n1+n2;
            n1=n2;
            n2=s;
        }
        System.out.println(s);
    }
}
