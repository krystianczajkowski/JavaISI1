package w3.Product;

/**
 * Product
 */
public class Product {
    static int numberOfProducts = 0;
    final static int MAX_PRODUCTS = 10;

    Product() {
        if (MAX_PRODUCTS > numberOfProducts) {
            numberOfProducts++;
        }
    }

    public static void main(String[] args) {
        Product p;
        for (int i = 0; i < 12; i++) {
            p = new Product();
            System.out.println(Product.numberOfProducts);
        }
    }
}
