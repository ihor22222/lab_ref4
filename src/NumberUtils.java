public class NumberUtils {
    public static int calculateTotal(int a, int b) {
        return a + b;
    }

    public static void printTotal(int a, int b) {
        int total = calculateTotal(a, b);
        System.out.println("Total: " + total);
    }
}
