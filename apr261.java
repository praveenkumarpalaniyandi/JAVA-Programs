import java.util.Arrays;
import java.util.Scanner;

public class apr261
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        {
            int N= sc.nextInt();
            int a[]=new int[N];
            for(int i=0;i<N;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<N;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
        }
    }
}
