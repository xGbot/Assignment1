public class BananaFactory extends GroceryProductFactory{
    int totalBananas;
    double price;
    public Product createProduct() {
        Product product = new Banana();
        totalBananas += 1;
        return product;
    }

    public void Inventory() {
        System.out.println("Total Bananas: " + totalBananas + "\n" + "Price of Bananas: " + price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
