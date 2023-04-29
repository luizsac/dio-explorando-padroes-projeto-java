/** Concrete implementation of the order made by the client
 * @author luizsac
 * @version 1.0
 */
public class Pizza implements Order {
    private double price;
    private String label;

    public Pizza(double price, String label) {
        this.price = price;
        this.label = label;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }

}