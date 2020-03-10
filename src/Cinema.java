import java.util.Scanner;

public class Cinema {
    /*
    Calculate the price for all the tickets for a cinema movie:
Reads the type of the movie, the rows and the seats per row in the cinema
Prints the total price for all seats formatted to the 2nd digit after the decimal point
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine().toLowerCase();
        int rows = Integer.parseInt(scanner.nextLine());
        int seatsPerRow = Integer.parseInt(scanner.nextLine());

        double ticketPrice =0;
        if (type.equals("normal"))
             ticketPrice = 7.50;
         else if (type.equals("premiere"))
             ticketPrice = 12.00;
         else if(type.equals("discount"))
             ticketPrice = 5.00;

            double income = ticketPrice * rows * seatsPerRow;
            System.out.printf("%.2f",income);

    }
}
