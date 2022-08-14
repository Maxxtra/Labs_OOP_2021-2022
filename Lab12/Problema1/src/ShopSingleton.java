import java.util.*;

public class ShopSingleton {
    private static ShopSingleton instance;
    private String name;
    private ArrayList<Product> products;

    private ShopSingleton(String name) {
        this.name = name;
        products = new ArrayList<Product>();
    }

    public static ShopSingleton getInstance(String name) {
        if (instance == null) {
            synchronized (ShopSingleton.class) {
                if (instance == null) {
                    instance = new ShopSingleton(name);
                }
            }
        }

        return instance;
    }

    public static ShopSingleton getInstance() {
        return instance;
    }

    public static void setInstance(ShopSingleton instance) {
        ShopSingleton.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

}
