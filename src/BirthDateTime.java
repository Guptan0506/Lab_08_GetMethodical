import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter year of birth(1950-2015)", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int date = SafeInput.getRangedInt(in, "Enter you data of birth", 1, 31);
        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);
        System.out.println("Date and time of birth: "+hour + ": "+ minute + " on "+date + " "+ month + " "+ year);
    }
}
