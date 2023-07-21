import java.util.Scanner;

public class heart {
    public static void main(String[]args)
    {
        int a=7;
        int b=7;

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(" ");
                if(i==0&&j==1||i==0&&j==2||i==0&&j==4||i==0&&j==5)
                {
                    System.out.print("*");
                }
                else if(i==1&&j==0||i==1&&j==3||i==1&&j==6)
                {
                    System.out.print("*");
                }
                else if(i==2&&j==0||i==2&&j==6)
                {
                    System.out.print("*");
                }
                else if(i==2&&j==1)
                {
                    System.out.print("B");
                }
                else if(i==2&&j==2)
                {
                    System.out.print("H");
                }
                else if(i==2&&j==3)
                {
                    System.out.print("U");
                }
                else if(i==2&&j==4)
                {
                    System.out.print("V");
                }
                else if(i==2&&j==5)
                {
                    System.out.print("I");
                }
                else if(i==3&&j==1||i==3&&j==5)
                {
                    System.out.print("*");
                }
                else if(i==4&&j==2||i==4&&j==4)
                {
                    System.out.print("*");
                }
                else if(i==5&&j==3)
                {
                    System.out.print("*");
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
