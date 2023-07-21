import java.util.ArrayList;


interface a
{
     void printhash();
}


class hash implements a
{
     public void printhash()
    {
        String str = "move#hash#to#front";
        int n=str.length();
        System.out.println(str);
        int hashes = 0;

        for (int i = 0; i <n; i++)
        {
            if(str.charAt(i)=='#')
            {
                hashes++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<hashes;i++)
        {
            sb.append('#');
        }
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!='#')
            {
                sb.append(str.charAt(i));
            }
        }
        String result = sb.toString();
        System.out.println(hashes);
        System.out.println(result);
    }
    }
public class apr19nit1
{
    public static void main(String[] args)
    {
        hash a=new hash();
        a.printhash();

    }

}
