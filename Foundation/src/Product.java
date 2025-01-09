public class Product {
    public static void main(String[] args) {
        String name = "Mouse Gamer R07x";
        float price = 179.99F;
        int qty = 10;
        boolean inStock = true;

        System.out.println(name);
        System.out.println(price);
        System.out.println(qty);
        System.out.println(inStock);

        name = "Keyboard Gamer Az900";
        price = 299.99F;
        qty = 0;
        inStock = false;

        System.out.println(name);
        System.out.println(price);
        System.out.println(qty);
        System.out.println(inStock);

        var title = "Arbor";
        var kind = "Herbology";
        var fullBook = title + " - " + kind;

        System.out.println(fullBook);

        // Constants
        final int WEEK_DAYS = 7;
        final double PI = 3.14159;
        final String WELCOME_MESSAGE = "Welcome to Java";

        System.out.println(WEEK_DAYS);
        System.out.println(PI);
        System.out.println(Math.PI);
        System.out.println(WELCOME_MESSAGE);
    }
}
