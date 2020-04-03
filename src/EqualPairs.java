import java.util.Scanner;

public class EqualPairs {
    /*
    Write a program, which:
Reads number n and n pairs of numbers
Prints "Yes, value={sum}", if the sum of all pairs is the same
Otherwise, prints "No, maxdiff={diff}"
diff is the max difference in the sum between two pairs
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prevSum = 0;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;

            if (i > 0) {
                int diff = Math.abs(prevSum - sum);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
            prevSum = sum;
        }
        if (maxDiff == 0) {
            System.out.println("Yes, value=" + prevSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }

}

