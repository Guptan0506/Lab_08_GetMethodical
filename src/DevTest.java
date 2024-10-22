
import java.util.Scanner;
public class DevTest {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("Full name: "+ firstName + " "+ lastName);

        int number = SafeInput.getInt(in, "Enter any integer");
        System.out.println("You entered: "+ number);

        double doubleVal = SafeInput.getDouble(in, "Enter any double value");
        System.out.println("You entered: " + doubleVal);

        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer within the range", 1, 10);
        System.out.println("You entered: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double within the range", 1.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("Your choice: " + (confirm ? "True" : "False"));

        String regExString = SafeInput.getRegExString(in, "Enter a string matching the pattern [a-z]{3}", "[a-z]{3}");
        System.out.println("You entered: " +regExString);
    }
}
