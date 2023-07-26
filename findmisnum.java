import java.util.Scanner;

public class findmisnum
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter Array Size :");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.printf("\nEnter A Num To Find :");
        int flag=0;
        int m=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            if(m==arr[i]) {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
