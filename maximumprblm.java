public class maximumprblm {
    public static void main(String[] args) {

        int a[]={1,2,3,1,4,5,2,3,6};
        int k=3;
        int n=a.length;
        int max;


        for(int i=0;i<=n-k;i++)
        {
            max=a[i];
            for(int j=1;j<k;j++)
            {
                if(a[i+j]>max)
                    max=a[i+j];

            }
            System.out.println(max+" ");
        }


    }
}
