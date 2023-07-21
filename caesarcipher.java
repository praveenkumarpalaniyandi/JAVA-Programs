public class caesarcipher
{
    public static String encoded(String enc,int offset)
    {
        offset=offset %26+26;
        StringBuilder encoded=new StringBuilder();
        for(char i:enc.toCharArray())
        {
            if(Character.isLetter(i))
            {
                if(Character.isUpperCase(i))
                {
                    encoded.append((char)('A'+(i-'A'+offset%26)));
                }
                else
                {
                    encoded.append((char) ('a'+i-'a'+offset%26));
                }
            }
            else
            {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
    public static String decode(String enc,int offset)
    {
        return encoded(enc,26-offset);
    }
    public static void main(String[]args)throws java.lang.Exception
    {
        String msg="Anna University";
        System.out.println("Simulating caesercipher");
        System.out.println("Input:"+msg);
        System.out.println("Encryptec message:");
        System.out.println((caesarcipher.encoded(msg,3)));
        System.out.printf("decrypted message:");
        System.out.println(caesarcipher.decode(caesarcipher.encoded(msg,3),3));
    }
}
