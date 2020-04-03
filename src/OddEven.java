import java.util.Scanner;

public class OddEven {
    /*
Write a program that reads the n - count of numbers entered by the user, and calculates the amount
 of the minimum and maximum numbers of odd and even positions (counting from 1).
If there is not minimum/maximum element print "No"
Input
On the first input line read count of numbers - N - integer [0...100]
On every next line read a number - floating-point number [-100...100]
Output
The output should be formatted in the following form:
"OddSum=" + {sum of the numbers on odd positions},
"OddMin=" + {minimum value of the numbers of odd positions} / {"No"},
"OddMax=" + {maximum value of the numbers of odd positions} / {"No"},
"EvenSum=" + {sum of the numbers of even positions}
"EvenMin=" + {minimum value of the numbers of even positions} / {"No"},
"EvenMax=" + {maximum value of the numbers of even positions} / {"No"}
Each number should be formatted to the second decimal point.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (int i = 1; i < n ; i++) {
            double nr = scanner.nextDouble();
            if (nr < min) min = nr;
            if (nr > max) max = nr;

            if (nr % 2 == 0){

            }
        }

    }
}
