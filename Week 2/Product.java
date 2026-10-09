public class Product {
    private int id;
    private String name;
    private String brand;
    private double price;
    private int stock;
    private double weight;
    private int inputs;
    private int outputs;

    public Product(int id, String name, String brand, double price, int stock, double weight, int inputs, int outputs) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
        this.weight = weight;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    public int getID() { return this.id; }
    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public String getBrand() { return this.brand; }
    public int getStock() { return this.stock; }
    public double getWeight() { return this.weight; }
    public int getInputs() { return this.inputs; }
    public int getOutputs() { return this.outputs; }
}
