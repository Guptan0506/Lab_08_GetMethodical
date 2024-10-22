import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        SafeInput.prettyHeader(message);
    }
}