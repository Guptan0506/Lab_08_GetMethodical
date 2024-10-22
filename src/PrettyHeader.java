import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        prettyHeader(message);
    }

    public static void prettyHeader(String msg) {
        int width = 60;
        int padding = (width - 6 - msg.length()) / 2;

        System.out.println("*".repeat(width));
        System.out.print("***");
        System.out.print(" ".repeat(padding));
        System.out.print(msg);
        System.out.print(" ".repeat(width - 6 - padding - msg.length()));
        System.out.println("***");
        System.out.println("*".repeat(width));
    }
}