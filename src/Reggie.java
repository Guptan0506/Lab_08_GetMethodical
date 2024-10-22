import java.util.Scanner;

public class Reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String SSN = SafeInput.getRegExString(in, "Enter a SSN ", "^\\d{3}-\\d{2}-\\d{4}$");
        String UCStudentMNum = SafeInput.getRegExString(in, "Enter your UC Student M number ", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice ", "^[OoSsVvQq]$");
        System.out.println("Your SSN is "+ SSN);
        System.out.println("Your M number is "+ UCStudentMNum);
        System.out.println("Your menu Choice is "+ menuChoice);
    }
}
