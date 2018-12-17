package turbomann.L;
import java.text.NumberFormat;
public class Calc {
    public static void main(String args[]) {
        double amount = 100.05;
        double discount = (amount / 100)* 10;
        double total = amount - discount;
        double tax = (total /100)* 5;
        double taxedTotal = tax + total;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Subtotal : "+ money.format(amount));
        System.out.println("Discount : " + money.format(discount));
        System.out.println("Total : " + money.format(total));
        System.out.println("Tax : " + money.format(tax));
        System.out.println("Tax+Total: " + money.format(taxedTotal));
    }
}