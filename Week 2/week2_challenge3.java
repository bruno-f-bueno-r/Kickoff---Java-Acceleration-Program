void main() {
    ArrayList<Product> inventory = new ArrayList<>();
    Product product1 = new Product(325, "Ketchup", "Heinz", 30.5, 130, 0.5, 20, 10);
    Product product2 = new Product(102, "Mayonnaise", "Heinz", 28.3, 200, 2, 40, 30);
    Product product3 = new Product(385, "Bread", "Nature's Own", 30.5, 97, 0.8, 10, 25);
    Product product4 = new Product(432, "Yogurt", "Chobani", 15.7, 100, 0.2, 15, 30);
    int option;

    inventory.add(product1);
    inventory.add(product2);
    inventory.add(product3);
    inventory.add(product4);

    do {
        IO.println("-------- Inventory Management --------");
        IO.println("1. Add Product");
        IO.println("2. Remove Product");
        IO.println("3. See Stock Movement");
        IO.println("4. Search Product");
        IO.println("5. See full inventory");
        IO.println("6. Exit");
        option = Integer.parseInt(IO.readln("Enter an option: "));

        switch (option) {
            case 1:
                boolean dec = false;
                int ID;
                do {
                    ID = Integer.parseInt(IO.readln("Enter the ID of the product: "));
                    for(Product product : inventory) {
                        if(product.getID() == ID) {
                            dec = true;
                            IO.println("Error! There's already an employee with that ID...");
                            break;
                        }
                        else dec = false;
                    }
                } while(dec);
                String name = IO.readln("Name: ");
                String brand = IO.readln("Brand: ");
                double price = Double.parseDouble(IO.readln("Price: "));
                int stock = Integer.parseInt(IO.readln("Stock: "));
                double weight = Double.parseDouble(IO.readln("Weight: "));
                int inputs = Integer.parseInt(IO.readln("Inputs: "));
                int outputs = Integer.parseInt(IO.readln("Outputs: "));

                inventory.add(new Product(ID, name, brand, price, stock, weight, inputs, outputs));
                IO.println("Product added!");
                break;
            case 2:
                int search;
                boolean flag = false;
                do {
                    search = Integer.parseInt(IO.readln("Enter the ID of the product to remove from inventory: "));
                    for(Product product : inventory) {
                        if(product.getID() == search) {
                            inventory.remove(product);
                            IO.println("Product removed");
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        IO.println("Error! The id doesn't exist");
                    }
                } while(!flag);
                break;
            case 3:
                int id2;
                boolean flag2 = false;
                do {
                    id2 = Integer.parseInt(IO.readln("Enter the ID of the product to see its stock movement: "));
                    for(Product product : inventory) {
                        if(product.getID() == id2) {
                            IO.println("Product: " + product.getName());
                            IO.println("- Inputs: " + String.format("%d", product.getInputs()));
                            IO.println("- Outputs: " + String.format("%d", product.getOutputs()));
                            IO.println("- Stock: " + String.format("%d", product.getStock()));
                            flag2 = true;
                            break;
                        }
                    }
                    if(!flag2) IO.println("Error! The id doesn't exist");
                } while(!flag2);
                break;
            case 4:
                int id3;
                boolean flag3 = false;
                do {
                    id3 = Integer.parseInt(IO.readln("Enter the ID of the product to search: "));
                    for(Product product : inventory) {
                        if(product.getID() == id3) {
                            IO.println("- Name: " + product.getName());
                            IO.println("- Brand: " + product.getBrand());
                            IO.println("- Price: $" + String.format("%.2f", product.getPrice()));
                            IO.println("- Weight: " + String.format("%.2f", product.getWeight()) + " kg");
                            IO.println("- Stock: " + String.format("%d", product.getStock()));
                            IO.println("- Inputs: " + String.format("%d", product.getInputs()));
                            IO.println("- Outputs: " + String.format("%d", product.getOutputs()));
                            flag3 = true;
                            break;
                        }
                    }
                    if(!flag3) IO.println("Error! The id doesn't exist");
                } while(!flag3);
                break;
            case 5:
                IO.println("");
                for(Product product : inventory) {
                    IO.println("ID: " + product.getID());
                    IO.println("- Name: " + product.getName());
                    IO.println("- Brand: " + product.getBrand());
                    IO.println("- Price: $" + String.format("%.2f", product.getPrice()));
                    IO.println("- Weight: " + String.format("%.2f", product.getWeight()) + " kg");
                    IO.println("- Stock: " + String.format("%d", product.getStock()));
                    IO.println("- Inputs: " + String.format("%d", product.getInputs()));
                    IO.println("- Outputs: " + String.format("%d", product.getOutputs()));
                    IO.println("");
                }
                break;
            case 6:
                IO.println("See you later!");
                break;
            default:
                IO.println("Error! The option must be between 1 - 6");
        }
        IO.println("");
    } while(option != 6);
}