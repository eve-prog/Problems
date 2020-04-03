import java.util.Scanner;

public class Hospital {
    /*For a period of time, patients are arriving every day in the hospital for examination.
It has initially 7 doctors.
Each doctor can only review one patient per day,
 but sometimes there is a shortage of doctors, so other patients are sent to other hospitals.
Every third day the hospital makes calculations and if the number of unreviewed patients is greater than the number of reviewed,
one more doctor is appointed.
As the appointment of the doctor occurs before the intake of patients for the day.
Write a program that calculates the number of reviewed and unreviewed patients for the given period.
Input
The input is read from the console and contains:
The period for which you need to perform calculations - integer in range [1... 1000]
On the following lines (equal to the number of days) – the number of patients arriving for review for the current day - integer in range [0... 10 000]
Print on the console 2 lines:
First line: "Treated patients: {Number of patients reviewed}."
Second line: "Untreated patients: {Number of unreviewed patients}."
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        int reviewedPatients = 0;
        int unreviewedPatients = 0;
        int doctors = 7;
        for (int i = 1; i <= days; i++) {
            int nrOfPatients = scanner.nextInt();

            if (i == 3 && unreviewedPatients >= reviewedPatients) {
                doctors += 1;
            }

            if (nrOfPatients > doctors){
                unreviewedPatients = unreviewedPatients + nrOfPatients - doctors;
                reviewedPatients = reviewedPatients + doctors;
            }else{
                reviewedPatients = reviewedPatients + nrOfPatients;
            }
        }
        System.out.println("Treated patients: " + reviewedPatients + ".");
        System.out.println("Untreated patients: " + unreviewedPatients + ".");

    }
}


