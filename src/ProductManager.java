public class ProductManager {
    public static void main(String[] args) {
        System.out.println("ProductManager started.");

        double price = 100.0;
        double discountPercent = 15.0;
        double discounted = calculateDiscount(price, discountPercent);
        System.out.println("Discounted price: " + discounted);
    }

    // (Doc comment will be added in the next commit)
    public static double calculateDiscount(double price, double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percent must be between 0 and 100.");
        }
        double discount = price * (percent / 100.0);
        return price - discount;
    }
}
