import java.util.*;

class A {
    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] a = new String[n];
        String[] b = new String[m];
        String[] c = new String[n + m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[n + i] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    void main1() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] a = new String[n];
        String[] b = new String[m];
        String[] c = new String[n + m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[n + i] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}