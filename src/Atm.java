import java.util.Scanner;

public class Atm {
    /*
    Write a program to simulate an ATM withdrawal:
Read: balance, withdraw and limit
Print "The withdraw was successful." if the balance is enough
Print "The daily limit was exceeded." if the limit is exceeded
Print "Insufficient availability." if the balance isn't enough
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = Integer.parseInt(scanner.nextLine());
        int withdraw = Integer.parseInt(scanner.nextLine());
        int dailyLimit = Integer.parseInt(scanner.nextLine());

        if (balance > withdraw && dailyLimit > withdraw){
            System.out.println("The withdraw was successful.");
        }else if(withdraw >= dailyLimit) {
            System.out.println("The daily limit was exceeded.");
        }else if (withdraw > balance){
            System.out.println("Insufficient availability.");
        }

    }
}
