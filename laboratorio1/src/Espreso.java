public class Espreso extends Coffee {
    private int numberOfShots;
    
    public Espreso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }
    
    public void printEspressoDetails() {
      double total = this.price * this.numberOfShots;
      System.out.println("\nYou asked for " + this.numberOfShots + " servings! Every serving of Espresso costs $" + this.price + ". Your total bill is $" + total);
    }
}