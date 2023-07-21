public class philip2 {
    public static void main(String[] args) {

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];

        System.out.println("Original");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Transpose");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=a[j][i];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Clockwise");

        for(int i=0;i<3;i++)
        {
            for(int j=2;j>=0;j--)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Anticlockwise");

        for(int i=2;i>=0;i--)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }


    }
}
