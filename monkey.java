import java.util.Scanner;

public class monkey
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.printf("total no of monkey:");
        int n=scan.nextInt();
        System.out.printf("no of eatable banana:");
        int k=scan.nextInt();
        System.out.printf("no of eatable peanuts:");
        int j=scan.nextInt();
        System.out.printf("total no of banana:");
        int m=scan.nextInt();
        System.out.printf("total no of peanut:");
        int p=scan.nextInt();

        int N=m/k;
        int M=p/j;
        int L=N+M;
        int P=n-L;
        if(m%k>0)
        {
            System.out.printf("No of monkeys left:");
            System.out.println(P-1);
        }
        else {
            System.out.printf("No of monkeys left:");
            System.out.println(P);
        }




    }
}
