public class array2 {
    public static void main(String[]args)
    {
        int a[][]={{1,2},{3,4}};
        int b[][]={{1,2},{3,4}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
