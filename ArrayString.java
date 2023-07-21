public class ArrayString {
    public static void main(String[]args)
    {
        String str1="abc";
        String str2="bca";
        String str3="cab";
        String str5="bac";
        String str4=str1+str1;
        System.out.println(str4);
        System.out.println(str4.contains(str2));
        System.out.println(str4.contains(str3));
        System.out.println(str4.contains(str5));

    }
}
