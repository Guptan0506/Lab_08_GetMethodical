import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInteger = SafeInput.getInt(in, "Enter your favorite integer: ");
        System.out.println("Your favorite integer is : "+ favInteger);
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double: ");
        System.out.println("Your favorite double is: "+ favDouble);
    }
}
