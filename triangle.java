public class triangle
{
    public static void main(String[]args)
    {
        int n=5;
        int j=5;
        int s;
        for(int i=0;i<n;i++)
        {
            for(s=0;s<n-i-1;s++)
            {
                System.out.printf(" ");
            }
            for(j=0;j<n-s;j++)
            {
                System.out.printf(" *");
            }
            System.out.printf("\n");
       }
    }

}
