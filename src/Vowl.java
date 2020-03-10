import java.util.Scanner;

public class Vowl {
    public static void main(String[] args) {
        /*
Write a program to check a letter for vowel or consonant:
Read a letter from the English alphabet
Print either "Vowel" or "Consonant"
Output
Consonant
         */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase();
        char letter = input.charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }



    }
}
