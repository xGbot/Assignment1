public class AppleFactory extends GroceryProductFactory {
    int totalApples;
    double price;
    public Product createProduct() {
        Product product = new Apple();
        totalApples += 1;
        return product;
    }
    public void Inventory() {
        System.out.println("Total Apples: " + totalApples + "\n" + "Price of Apples: " + price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
