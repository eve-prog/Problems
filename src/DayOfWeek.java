import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        /*
        Write a program that reads
        an integer from the console and prints day of the week (in English) in range [1…7] and "Error" if the number is invalid.
         */

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        }else if (day == 3){
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if (day == 5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else if (day == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Error");
        }
    }
}
