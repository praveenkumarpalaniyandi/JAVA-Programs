import java.util.Scanner;

public class fingers {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int r=n%8;
        String finger = "";
        switch (r)

        {
            case 1:
            case 9:
                finger = "Thumb";
                break;
            case 2:
            case 8:
                finger = "Index";
                break;
            case 3:
            case 7:
                finger = "Middle";
                break;
            case 4:
            case 6:
                finger = "Ring";
                break;
            case 5:
                finger = "Little";
                break;
            default:
                finger = "Invalid";
                break;
        }
        System.out.println("The finger name is: " + finger);


    }

}
