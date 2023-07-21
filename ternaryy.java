import java.util.Scanner;

public class ternaryy
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        int num=scan.nextInt();
        if(num==0)
        {
            System.out.println("the num is zero");
        }
        else
        {
            String result = num > 0 ? "the num is positive" : "the num is negative";
            System.out.println(result);
        }
    }
}











