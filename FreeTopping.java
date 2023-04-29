/** Concrete implementation of the decorator Extra for adding free extra topping to the pizza
 * @author luizsac
 * @version 1.0
 */
public class FreeTopping extends Extra {

    public FreeTopping(Order order, double price, String label) {
        super(order, price, label);
    }

    // returns only the price of the order, with no addition
    public double getPrice() {
        return order.getPrice();
    }

}