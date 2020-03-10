import java.util.Scanner;

public class TheBiggest {
    /*
    Write a program to find the biggest among 5 numbers
Read 5 integers
Print the biggest number
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();
        int nr3 = scanner.nextInt();
        int nr4 = scanner.nextInt();
        int nr5 = scanner.nextInt();

        if (nr1 >= nr2 && nr2 >= nr3 && nr3 >= nr4 && nr4 >= nr5){
            System.out.println(nr1);
        }else if (nr2 >= nr1 && nr2 >= nr3 && nr2 >= nr3 && nr2 >= nr3){
            System.out.println(nr2);
        }else if (nr3 >= nr1 && nr3 >= nr2 && nr3 >= nr4 && nr3 >= nr5){
            System.out.println(nr3);
        }else if (nr4 >= nr1 && nr4 >= nr2 && nr4 >= nr3 && nr4 >= nr5) {
            System.out.println(nr4);
        }else{
            System.out.println(nr5);
        }
    }
}
