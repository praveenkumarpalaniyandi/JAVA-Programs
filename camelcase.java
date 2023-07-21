import java.util.Scanner;

public class camelcase
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        //String s2[]=s1.split(" ");
        int n=s1.length();
        char c[]=s1.toCharArray();
        //int C=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                c[i]=Character.toUpperCase(c[i]);
            }
            if(c[i]==' ')
            {
                c[i+1]=Character.toUpperCase(c[i+1]);

            }
        }
        System.out.println(c);
       // System.out.println(s1);

    }
}
