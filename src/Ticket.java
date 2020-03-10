import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        //Write a program to calculate a ticket price:
        //
        //Read a ticket type: either student or regular
        //
        //Print the price in the following format "${price}":
        //
        //The price should be formatted to 2nd digit after the decimal point
        //
        //Student ticket price: 1.00
        //
        //Regular ticket price: 1.60
        //
        //For invalid type print "Invalid ticket type!"

        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();

        if (ticket.equals("student")){
            System.out.println("$1.00");
        }else if (ticket.equals("regular")){
            System.out.println("$1.60");
        }else{
            System.out.println("Invalid ticket type!");
        }
    }
}
