public class stringrotate
{
    public static void main(String[] args)
    {
        String[] s1={"coimbatore"," i","am","from"};
        int n=s1.length;
        for (int i=1 ;i<n; i++)
        {
            String temp = s1[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < s1[j].length())
            {
                s1[j+1] = s1[j];
                j--;
            }
            s1[j+1] = temp;
        }

        for (int i=0; i<n; i++)
        {
            System.out.print(s1[i] + " ");
        }
        //System.out.println(n);

    }
}
