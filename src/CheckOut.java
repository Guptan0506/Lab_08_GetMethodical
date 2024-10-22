import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double priceOfItem = 0.0;
        double totalPrice = 0.0;
        boolean moreItems = true;
        while (moreItems){
            priceOfItem = SafeInput.getRangedDouble(in, "Enter the price of the item: ", 0.50, 10.00);
            totalPrice += priceOfItem;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items? [y / n] ");
        }
        System.out.println("Total cost: $"+ totalPrice);
    }
}
