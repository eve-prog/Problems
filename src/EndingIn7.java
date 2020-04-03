import java.util.Scanner;

public class EndingIn7 {
    /*
    Write a program that prints the numbers in the range [1...1000], which end in 7.
Print the numbers on a single line, separated by a single space.
Example
Input
Output
(no input)
7 17 27 ... 997
     */
    public static void main(String[] args) {

        for (int i = 7; i < 1000; i+=10) {
            System.out.print(i + " ");
        }
    }
}
