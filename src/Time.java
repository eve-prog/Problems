import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        /*
Write a program that reads from the console an hour and minutes from 24-hour day, and calculates what will be the time after 15 minutes.
Input
The input consists two lines:
The hours - integer in range [0...23]
The minutes - integer in range [0...59]
Output
Print the result in the following format: "{hours}:{minutes}".
The hours should be formatted without leading zero.
The minutes should be formatted with leading zero.
         */
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        if (minutes + 15 >= 60) {
            minutes = (minutes + 15) % 60;
            hours++;
        } else {
            minutes = minutes + 15;
        }
        if (hours >= 24) {
            hours = hours % 24;
        }

        String realHour = String.valueOf(hours);
        String realMinutes = String.valueOf(minutes);

        if (realMinutes.length() == 1) {
            realMinutes = "0" + realMinutes;

        }
        System.out.println(realHour + ":" + realMinutes);

    }

}


