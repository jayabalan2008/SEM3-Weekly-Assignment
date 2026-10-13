class Cart {
    private final int[] prices;
    private int itemCount;
    private final String cartId;
    Cart(String cartId, int capacity) { if (capacity < 0) throw new IllegalArgumentException("capacity cannot be negative"); this.cartId = cartId; prices = new int[capacity]; }
    public boolean addItem(int price) {
        if (price < 0) throw new IllegalArgumentException("price cannot be negative");
        if (itemCount == prices.length) return false;
        prices[itemCount++] = price; return true;
    }
    public int getTotal() { int total = 0; for (int i = 0; i < itemCount; i++) total += prices[i]; return total; }
    public int getItemCount() { return itemCount; }
    public String getCartId() { return cartId; }
}
public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20); cart.addItem(250); cart.addItem(99); cart.addItem(151);
        System.out.println("Total: " + cart.getTotal()); System.out.println("Item count: " + cart.getItemCount());
    }
}
