import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char a[]=s.toCharArray();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}

