import java.util.*;

public class mar10night3
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string :");
            String str = sc.next();
            int index[]= new int[str.length()];
            char ch[]= new char[str.length()];
            char stri[] = str.toCharArray();
            int in=0,i,j;
            char vowel[] = {'a','e','i','o','u','A','E','I','O','U'};
            for(i=0;i<str.length();i++)//str[i]!='\0'
            {
                //char a=string.charAt(i);
                for(j=0;j<vowel.length;j++)
                {
                    if(str.charAt(i)==vowel[j])
                    {
                        ch[in]=str.charAt(i);
                        index[in]=i;
                        in++;
                    }
                }
            }
            //System.out.println(" "+in);
            for(i=0,j=in-1;i<in;i++,j--)
            {
                stri[index[i]]=ch[j];
            }
            String out = new String(stri);
            System.out.println(stri);
		/*for(i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+" "+index[i]);
		}*/
        }
}
