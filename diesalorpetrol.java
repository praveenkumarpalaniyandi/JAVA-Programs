import java.util.Scanner;

public class diesalorpetrol
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int A1=scan.nextInt();
        int B1=scan.nextInt();
        int C1=scan.nextInt();
        int D1=scan.nextInt();
        int E1=scan.nextInt();
        int A2=scan.nextInt();
        int B2=scan.nextInt();
        int C2=scan.nextInt();
        int D2=scan.nextInt();
        int E2=scan.nextInt();
        System.out.printf("Enter month :");
        int month=scan.nextInt();

        int m1=(D1/A1)*B1;
        int m2=(D2/A2)*B2;

        int petrol=(C1+m1+E1)*month;
        System.out.println(petrol);

        int diesel=(C2+m2+E2)*month;
        System.out.println(diesel);

        if(petrol<diesel)
        {
            System.out.println("petrol car is best");
        }
        else
        {
            System.out.println("diesel car is best");
        }

    }
}
