import java.util.Scanner;

public class SortedNumbers {
    public static void main(String[] args) {
        /*
        Write a program, which checks for sorted 3 numbers:
Read 3 real numbers
Print "Ascending" if the numbers are in ascending order
Print "Descending" if the numbers are in descending order
Print "Not sorted" in any other case
         */
        Scanner scanner = new Scanner(System.in);
        double nr1 = Double.parseDouble(scanner.nextLine());
        double nr2 = Double.parseDouble(scanner.nextLine());
        double nr3 = Double.parseDouble(scanner.nextLine());


        if (nr1 < nr2 && nr2 < nr3){
            System.out.println("Ascending");
        }else if(nr1 > nr2 && nr2 > nr3){
            System.out.println("Descending");
        }else{
            System.out.println("Not sorted");
        }
    }
}
