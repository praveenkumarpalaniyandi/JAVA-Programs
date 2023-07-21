import java.util.Arrays;

public class sort1
{
    public static void main(String[] args)
    {

        /*-------Normal sorting-------*/


        int arr[]={10,40,15,-1,20,70,-15,0,7,50};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.print(arr[i]+" ");
            System.out.println();
        }



        /*-------using inbuild functions--------*/

//          Arrays.sort(arr);
////        for(int i=0;i<arr.length;i++)
////        {
////            System.out.println(arr[i]);
////        }


    }
}
