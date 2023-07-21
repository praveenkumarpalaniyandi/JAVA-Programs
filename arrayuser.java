import java.util.Scanner;

public class arrayuser {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();
        int arr[]=new int[20];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
