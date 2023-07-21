import java.util.Scanner;

public class abcd {
    public static void sorting(char chars[], int count[]) {
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count[i] < count[j]) {
                    int temp1 = count[i];
                    count[i] = count[j];
                    count[j] = temp1;
                    char temp2 = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp2;
                    j = i;
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int d = scan.nextInt();
        String str2 = "";
        int n = str1.length();
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            if (!str2.contains(str1.charAt(i) + "")) {
                str2 += str1.charAt(i);
            }
        }
        System.out.println(str2);

        char chars[] = str2.toCharArray();
        int count[] = new int[str2.length()];

        for (int i = 0; i < str2.length(); i++) {
            int counts = 0;
            for (int j = 0; j < n; j++) {
                if (str2.charAt(i) == str1.charAt(j))
                    counts++;
            }
            count[i] = counts;
            System.out.print(chars[i] + " ");
            System.out.println(counts);
        }


        if (n >= d) {
            sorting(chars, count);
            boolean flag = true;
            while (flag) {
                sorting(chars, count);
                for (int i = 0; i < n - 1; i++) {
                    if (count[i] == count[i + 1]) {
                        if (chars[i] > chars[i + 1]) {
                            int temp = count[i];
                            count[i] = count[i + 1];
                            count[i + 1] = temp;
                            char ch = chars[i];
                            chars[i] = chars[i + 1];
                            chars[i + 1] = ch;
                        }
                    }
                }
                for (int i = 0; i < d; i++) {
                    if (count[i] == 0) {
                        flag = false;
                        break;
                    }
                    System.out.print(chars[i]);
                    count[i]--;
                }
            }
        } else {
            System.out.println(" Cannot be rearranged");


        }

    }
}

