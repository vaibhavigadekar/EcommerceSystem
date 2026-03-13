
import products.*;
import cart.ShoppingCart;
import orders.Order;

public class Main {

    public static void main(String[] args) {

        // Create products
        ElectronicsProduct p1 = new ElectronicsProduct(1, "Laptop", 60000);
        ClothingProduct p2 = new ClothingProduct(2, "T-Shirt", 800);
        BookProduct p3 = new BookProduct(3, "Java Book", 500);

        // Create cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        // Show cart
        System.out.println("Products in Cart:");
        cart.showCart();

        // Place order
        Order order = new Order();
        order.placeOrder();
    }
}
