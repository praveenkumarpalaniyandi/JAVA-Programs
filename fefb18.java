import java.util.Arrays;
import java.util.Scanner;

public class fefb18 {
    public static void main(String[]args)
    {

        int num[]={8,9,10,2,5,6};
        int l=0;
        int r=num.length-1;

        while (l<=r)
        {
            if(num[l]<=num[r])
            {
                return;
            }
            int mid=(l+r)/2;

            int next=(mid+1)%num.length;
            int prev=(mid-1+num.length)%num.length;

            if(num[mid]<=num[next]&&num[mid]<=num[prev])
            {
                return ;
            }

            else if (num[mid]<=num[r])
            {
                r=mid-1;
            } else if (num[mid]>=num[l]) {
                l=mid+1;

            }
        }
        System.out.println(num);



    }
}
