import java.util.Scanner;

public class star1 {
    public static void main(String[]args)
    {
        Scanner scan1=new Scanner(System.in);
        String a=scan1.nextLine();
        int b=a.length();
        int n;
        n=b;
        if(n%2==0)
        {
            System.out.print(a);
        for(int i=1;i<b;i++)
        {
            System.out.print("*");
        }
        }
        else {
            System.out.print(a);
            for (int i = 1; i < b; i++) {
                System.out.print("*");
            }
        }
    }

}
