public class T2 {
    public static void main(String[]args)
    {
            int [][] a={{1,2,3},{4,5,6},{7,8,9}};

            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(" ");

                    if(i==0&&j==0)
                    {
                        System.out.print(a[0][1]+a[0][2]);
                    }
                    else if(i==0&&j==2)
                    {
                        System.out.print(a[0][0]+a[0][1]);
                    }
                    else if(i==1&&j==0)
                    {
                        System.out.print(a[1][1]+a[1][2]);
                    }
                    else if(i==1&&j==2)
                    {
                        System.out.print(a[1][0]+a[1][1]);
                    }
                    else if(i==2&&j==0)
                    {
                        System.out.print(a[2][1]+a[2][2]);
                    }
                    else if(i==2&&j==2)
                    {
                        System.out.print(a[2][0]+a[2][1]);
                    }
                    else
                    {
                        System.out.print(a[i][j]);
                    }
                }
                System.out.println();
            }
    }
}
