/** Concrete implementation of the decorator Extra for adding extra topping to the pizza
 * @author luizsac
 * @version 1.0
 */
public class ExtraTopping extends Extra {

    public ExtraTopping(Order order, double price, String label) {
        super(order, price, label);
    }

    // returns the price of the extra added to the price of the order
    public double getPrice() {
        return this.price + order.getPrice();
    }

}