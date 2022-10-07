public class Main {
    public static void main(String[] args) {
        // get AppleFactory from GroceryProductFactory
        GroceryProductFactory aFactory = ProductFactory.getFactory("a");
        aFactory.createProduct();
        aFactory.createProduct();
        aFactory.setPrice(2.99);
        // get BananaFactory from GroceryProductFactory
        GroceryProductFactory bFactory = ProductFactory.getFactory("b");
        bFactory.createProduct();
        bFactory.createProduct();
        bFactory.setPrice(1.25);

        // display factory inventories
        aFactory.Inventory();
        bFactory.Inventory();

    }
}