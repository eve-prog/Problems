import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Triangle {

    //Write a program to check if a triangle is valid by its sizes:
    //Read 3 integers: the sides of a triangle
    //Checks if each side is less than the sum of the others 2
    //Prints "Valid Triangle" if the above condition is met
    //Prints "Invalid Triangle" otherwise
    //Example
    //Input
    //Output
    //3
    //Valid Triangle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        if (sideB + sideC <= sideA ){
            System.out.println("Invalid Triangle");
        }else if(sideA + sideC <= sideB ){
            System.out.println("Invalid Triangle");
        }else if(sideA + sideB<=sideC){
            System.out.println("Invalid Triangle");
        }else{
            System.out.println("Valid Triangle");
        }

    }

}