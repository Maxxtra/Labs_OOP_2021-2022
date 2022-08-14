public class Test {
    public static void addProduct(Product product) {
        ShopSingleton instance = ShopSingleton.getInstance();
        instance.addProduct(product);
    }

    public static void removeProduct(Product product) {
        ShopSingleton instance = ShopSingleton.getInstance();
        instance.removeProduct(product);
    }

    public static Product getCheapestProduct() {
        Product min = null;
        float minimum = 1 << 30;

        for (Product product : ShopSingleton.getInstance().getProducts()) {
            if (product.getPrice() < minimum) {
                min = product;
                minimum = product.getPrice();
            }
        }

        return min;
    }

    public static void main(String[] args) {
        ShopSingleton instance = ShopSingleton.getInstance("Shopuletz");
        ProductFactory factory = new ProductFactory();

        Product prod1 = factory.factory("book","book", (float) 12.3);
        Product prod2 = factory.factory("computer","computer", (float) 12.3);
        Product prod3 = factory.factory("beverage","beverage", (float) 12.3);
        Product prod4 = factory.factory("food","food", (float) 12.3);

        addProduct(prod1);
        addProduct(prod2);
        addProduct(prod3);
        addProduct(prod4);

        removeProduct(prod2);

        System.out.println(getCheapestProduct().getName());
    }
}