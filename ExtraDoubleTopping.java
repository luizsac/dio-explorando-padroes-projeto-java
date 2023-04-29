/** Concrete implementation of the decorator Extra for adding extra double topping to the pizza
 * @author luizsac
 * @version 1.0
 */
public class ExtraDoubleTopping extends Extra {

    public ExtraDoubleTopping(Order order, double price, String label) {
        super(order, price, label);
    }

    // returns twice the price of the topping added to the price of the order
    public double getPrice() {
        return (this.price * 2) + order.getPrice();
    }

    public String getLabel() {
        return order.getLabel() + ", Double " + this.label;
    }

}