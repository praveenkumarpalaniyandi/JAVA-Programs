import java.util.Scanner;

public class HappyNumberChecker {
    public static boolean isHappyNumber(int number) {
        int slow = number;
        int fast = number;

        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static int squareSum(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();
        if (isHappyNumber(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}
