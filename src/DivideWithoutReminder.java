import java.util.Scanner;

public class DivideWithoutReminder {
    /*
    Write a program, which:
Reads n and n numbers
Finds in percentage how many of them can divide without remainder at 2, 3 and 4
Prints percentages p1, p2 and p3, formatted to the second digit
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numDiv2 = 0;
        int numDiv3 = 0;
        int numDiv4 = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                numDiv2++;
            }
            if (num % 3 == 0) {
                numDiv3++;
            }
            if (num % 4 == 0) {
                numDiv4++;
            }
        }
        double numbDiv2Percentage = 100.0 * numDiv2 / n;
        double numbDiv3Percentage = 100.0 * numDiv3 / n;
        double numbDiv4Percentage = 100.0 * numDiv4 / n;


        System.out.printf("%.2f", numbDiv2Percentage);
        System.out.println("%");
        System.out.printf("%.2f", numbDiv3Percentage);
        System.out.println("%");
        System.out.printf("%.2f", numbDiv4Percentage);
        System.out.println("%");
    }
}
