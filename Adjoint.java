public class Adjoint {
    public static void main(String[]args)
    {
        int a[][]={{1,2},{3,4}};
        int b[][]=new int[2][2];
        int c=-1;
        b[0][0]=a[1][1];
        b[0][1]=c*a[0][1];
        b[1][0]=c*a[1][0];
        b[1][1]=c*a[1][1];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
