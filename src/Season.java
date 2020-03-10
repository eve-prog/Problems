import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        /*
        Write a program, which calculates vacation expenses:
Read season, accommodation type and count of the days
Print the total expenses, based on the price table bellow,formatted to the 2nd * digit after the decimal point
         */
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine().toLowerCase();
        String accommodation =  scanner.nextLine().toLowerCase();
        int days =  scanner.nextInt();

        double rate = 0;
        if (season.equals("spring")){
            if (accommodation.equals("hotel")){
                rate = 30 * 0.8;
            }else{
                rate = 10 * 0.8;
            }

        }else if (season.equals("summer")) {
            if (accommodation.equals("hotel")) {
                rate = 50;
            } else {
                rate = 30;
            }

        }else if (season.equals("autumn")) {
            if (accommodation.equals("hotel")) {
                rate = 20 * 0.7;
            } else {
                rate = 15 * 0.7;
            }

        }else {
            if (accommodation.equals("hotel")) {
                rate = 40 * 0.9;
            } else {
                rate = 10 * 0.9;
            }

            double expenses = rate* days;
            System.out.printf("Expenses = %.2f\n", expenses);

        }

    }
}
