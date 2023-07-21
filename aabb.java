public class aabb
{
    public static void main(String[] args)
    {
        String str1="aaaabbbcc";
        String str2="";
        int d=2;
        int i;
        int n=str1.length();
        System.out.println(n);
        for( i=0;i<n;i++);
        {
            if(!str2.contains(str1.charAt(i)+""))
            {
                str2 += str1.charAt(i);
            }
        }
            System.out.println(str2);


    }
}
