public class FreeDrug extends Drug implements Medicine {
    private String name;
    private double price;
    private int quantity;

    public FreeDrug() {
        this.name = "Free Paracetamol";
        this.price = 0.0;
        this.quantity = 1;
    }

    public FreeDrug(String name, double price, int quantity) {
        super(name);
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