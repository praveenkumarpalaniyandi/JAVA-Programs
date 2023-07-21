public class feb11 {
    public static void main(String[]args)
    {
        int a=16;
        for(int i=0;i<a;i++)
        {
           for(int j=0;j<a;j++)
           {
               System.out.print("#");
               if(i==0&&j==0)
               {
                   System.out.print(a-15);
               }
               if(i==1&&j==2)
               {
                   System.out.print(a-14);
               }

           }
           System.out.println();
        }

    }
}
