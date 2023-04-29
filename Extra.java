/** Abstract implementation of the decorator responsible for
 *  adding extras to the order
 * @author luizsac
 * @version 1.0
 */
public abstract class Extra implements Order {

    protected Order order;
    protected double price;
    protected String label;

    public Extra(Order order, double price, String label) {
        this.order = order;
        this.price = price;
        this.label = label;
    }

    public abstract double getPrice();

    public String getLabel() {
        return order.getLabel() + ", " + this.label;
    }

}