public class cpattern {
    public static void main(String[]args)
    {
        int a=11;

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(" ");
                if(i==0&&j==4||i==0&&j==5||i==0&&j==6||i==0&&j==7)
                {
                    System.out.print("#");
                }
                else if(i==1&&j==2||i==1&&j==3||i==1&&j==8||i==1&&j==9)
                {
                    System.out.print("*");
                }
                else if(i==2&&j==1||i==2&&j==2||i==2&&j==9||i==2&&j==10)
                {
                    System.out.print("*");
                }
                else if(i==3&&j==0||i==3&&j==1)
                {
                    System.out.print("#");
                }
                else if(i==4&&j==0||i==4&&j==1)
                {
                    System.out.print("#");
                }
                else if(i==5&&j==0||i==5&&j==1)
                {
                    System.out.print("#");
                }
                else if(i==6&&j==0||i==6&&j==1)
                {
                    System.out.print("#");
                }
                else if(i==7&&j==0||i==7&&j==1)
                {
                    System.out.print("#");
                }
                else if(i==8&&j==1||i==8&&j==2||i==8&&j==9||i==8&&j==10)
                {
                    System.out.print("*");
                }
                else if(i==9&&j==2||i==9&&j==3||i==9&&j==8||i==9&&j==9)
                {
                    System.out.print("*");
                }
                if(i==10&&j==4||i==10&&j==5||i==10&&j==6||i==10&&j==7)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
