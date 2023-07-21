public class stringope
{
    public static void main(String[] args) {

        String s1="geek";
        String s2="gesek";
        int n1=s1.length();
        int n2=s2.length();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        System.out.println(c1);
        System.out.println(c2);

        for(int i=0;i<n1;i++)
        {
            if(c1.equals(c2))
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
        }
    }
}
