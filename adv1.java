import java.util.Arrays;

public class adv1 {
    public static void main(String[] args) {

        int a[][] = {{1000, 2000, 3000}, {4000}, {5000, 6000}, {7000, 8000, 9000}, {10000}};
        int b[] = new int[a.length];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
                b[i] = sum;
            }
            sum = 0;
        }
        System.out.println(Arrays.toString(b));

        int max = b[0];
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > max)
                max = b[i];
            index = i;
        }

       /* int min=b[1];
        int index=1;
        for(int i=0;i<b.length-1;i--)
        {
            if(b[i]<min)
                min=b[i];
            index=i;
        }*/

        System.out.println(index + "th elf has highest calories:" + max);
      //  System.out.println(index + "th elf has lowest calories:" + min);


    }
}

