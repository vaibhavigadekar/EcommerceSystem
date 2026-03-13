package cart;

import products.Product;
import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> cart = new ArrayList<>();

    public void addProduct(Product p) {
        cart.add(p);
        System.out.println("Product added to cart");
    }

    public void showCart() {
        for(Product p : cart) {
            p.displayProduct();
        }
    }
}