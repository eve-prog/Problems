import java.util.Scanner;

public class PersonalTitles {
    /*
    Write a console program that reads age (floating-point number) and gender("m" or "f") and and prints an address according to these principles:
"Mr." - a man (gender "m") of age 16 or more
"Master" - a boy (gender "m") under 16 years old
"Ms." - a woman (gender "f") of age 16 or more
"Miss" - a girl (gender "f") under 16 years old
Input
Entered from the console:
age - floating-point number
gender - "m" or "f"
Output
Print the expected address on a single line.
Example
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = scanner.nextDouble();
        char gender = scanner.next().charAt(0);

        if (age >= 16 && gender == 'm') {
            System.out.println("Mr.");
        }else if (age <= 16 && gender == 'm') {
            System.out.println("Master");
        }else if (age >= 16 && gender == 'f') {
            System.out.println("Ms.");
        }else if (age <= 16 && gender == 'f') {
            System.out.println("Miss");
        }
    }
}
