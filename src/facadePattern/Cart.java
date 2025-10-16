package facadePattern;

public class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        System.out.println("Cart service requested for " + numberOfCarts + " carts.");
    }

    @Override
    public void performService() {
        System.out.println("Cart service is being performed.");
    }
}