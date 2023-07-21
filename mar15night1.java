import java.util.Scanner;

public class mar15night1 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int n=scan.nextInt();
        int sum=0;
        int pro=1;
        int num;
        int num2;
        int num3;

        num=n*n;
        System.out.println(num);
        num2=n*n%200;
        System.out.println(num2);
        num3=n*n/100;
        System.out.println(num3);
        System.out.println(num2+num3);

        if(n==num2+num3)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }




    }
}
