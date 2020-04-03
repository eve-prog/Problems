import javafx.print.PageLayout;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class RollercoasterSimulator {
    /*
    Write a program, which:
Reads rollercoaster places, minimum age,  count of people on the queue and age for each person
If all places are taken, prints - "The rollercoaster departures"
In other case, prints "Waiting..."
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int places = scanner.nextInt();
        int ageLimit = scanner.nextInt();
        int n = scanner.nextInt(); //count of people on the queue

        int placesFilled = 0;
        for (int i = 0; i < n; i++) {
            int childAge = scanner.nextInt();
            if (childAge >= ageLimit) {
                placesFilled++;
            }
        }
        if (placesFilled >= places){
            System.out.println("The rollercoaster departures");
        }else{
            System.out.println("Waiting...");
        }
    }
}
