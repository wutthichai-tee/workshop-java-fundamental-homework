public class Vaccine implements Medicine {
    private String name;
    private double price;
    private int quantity;

    public Vaccine() {
        this.name = "Covid 18 Vaccine";
        this.price = 1.0;
        this.quantity = 1;
    }

    public Vaccine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public double calculatePrice() {
        return price * quantity;
    }
}