public class talantly223 {
    public static void main(String[]args)
    {
        int a[][]={{1,2,3},{15,23,14},{7,8,12}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==0&&j==0||i==0&&j==1||i==0&&j==2||
                        i==1&&j==0||i==1&&j==2||
                        i==2&&j==0||i==2&&j==1||i==2&&j==2)
                {
                    System.out.print(a.length*a.length);
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
