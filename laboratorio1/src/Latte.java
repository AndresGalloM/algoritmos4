public class Latte extends Coffee {
    private String milkType;
    private String syrupFlavor;

    // Parameterized constructor
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    // Method to print latte details
    public void printLatteDetails() {
        System.out.println("Latte Details:");
        System.out.println("Milk Type: " + milkType);
        System.out.println("Syrup Flavor: " + syrupFlavor);
    }
}