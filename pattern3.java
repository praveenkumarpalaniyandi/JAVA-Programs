public class pattern3
{
    public static void main(String[] args) {
        int n=6;
        char c='a';
        int num=0;

        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(num);

                if(j<i)
                {
                    System.out.print(c);
                }
                else {
                    System.out.println(c);
                }
            }
            System.out.println();
            c++;
            num++;
        }
    }
}
