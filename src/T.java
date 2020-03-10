import java.util.Scanner;

public class T {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        if (minutes < 59 && hours < 23) {
            minutes = minutes + 15;}

        if (minutes > 59) {
            hours = hours + 1;
            minutes = minutes - 60;
        }

        String realHour = String.valueOf(hours);
        String realMinutes = String.valueOf(minutes);

        if (realMinutes.length() == 1) {
            realMinutes = "0" + realMinutes;

        }
        System.out.println(realHour + ":" + realMinutes);


    }
}

