public class ProductFactory {
    public static GroceryProductFactory getFactory(String type){
        if ("a".equals(type)) {
            return new AppleFactory();
        }
        else {
            return new BananaFactory();
        }
    }
}
