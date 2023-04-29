public class Main {

    public static void main(String[] args) {
        Order napolitanPizza = new Pizza(10, "Napolitan Pizza");
        napolitanPizza = new ExtraTopping(napolitanPizza, 3, "Bacon");
        napolitanPizza = new ExtraDoubleTopping(napolitanPizza, 2, "Cheese");
        napolitanPizza = new FreeTopping(napolitanPizza, 0, "Oregano");

        System.out.println("Pizza: " + napolitanPizza.getLabel());  // Pizza: Napolitan Pizza, Bacon, Double Cheese, Oregano
        System.out.println("Price: " + napolitanPizza.getPrice());  // Price: 17.0
    }

}
