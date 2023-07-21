import java.util.Scanner;

public class mar9night2 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int sum=scan.nextInt();
        int N=scan.nextInt();
        int coin[]=new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = scan.nextInt();
           // System.out.print(coin[i]+" ");
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(coin[i]);
        }
            System.out.println("The sum is"+sum);

        while(sum >=0)
        {
            for(int i=0;i<N;i++)
            {
                if(sum >=coin[i])
                {
                    System.out.print(coin[i]+" ");
                    sum -=coin[i];
                    break;
                }
            }
        }


    }
}
