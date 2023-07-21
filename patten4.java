public class patten4 {
    public static void main(String[]args)
    {
        int n=5;
        int i;
        int j;

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0&&j==2||i==1&&j==2||i==2&&j==0||i==2&&j==1||i==2&&j==2||i==2&&j==3||i==2&&j==4||i==3&&j==2||i==4&&j==2)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("1 ");
                }
            }
            System.out.print("\n");
        }
    }
}
