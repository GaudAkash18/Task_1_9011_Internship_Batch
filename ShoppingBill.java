public class ShoppingBill {

    static double calculateElectronicsGST(double a, double b) {
        double sum = a + b;
        double gst = sum * 18 / 100;
        return sum + gst;
    }

    static double calculateFashionGST(double c, double d) {
        double sum = c + d;
        double gst = sum * 13 / 100;
        return sum + gst;
    }

    static double calculateFoodGST(double e) {
        double gst = e * 7 / 100;
        return e + gst;
    }

    static double totalBill(double a, double b, double c, double d, double e) {
        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);
        return electronics + fashion + food;
    }

    static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;
        return total - discount;
    }

    public static void main(String[] args) {
        double a = 100, b = 100, c = 100, d = 100, e = 100;

        double total = totalBill(a, b, c, d, e);
        double finalAmount = calculateDiscountedBill(a, b, c, d, e);
        double discount = total - finalAmount;

        System.out.println("Electronics : " + calculateElectronicsGST(a, b));
        System.out.println("Fashion     : " + calculateFashionGST(c, d));
        System.out.println("Food        : " + calculateFoodGST(e));
        System.out.println();
        System.out.printf("Total after GST = %.2f | Discount = %.2f | Final payable amount = %.2f%n",
                total, discount, finalAmount);
    }
}
