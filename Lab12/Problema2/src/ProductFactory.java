public class ProductFactory {
    public ProductFactory() {
    }

    public Product factory(String type, String nameProduct, float productPrice) {
        if (type.equalsIgnoreCase("book")) {
            return new Book(nameProduct, productPrice);
        } else if (type.equalsIgnoreCase("food")) {
            return new Food(nameProduct, productPrice);
        } else if (type.equalsIgnoreCase("computer")) {
            return new Computer(nameProduct, productPrice);
        } else if (type.equalsIgnoreCase("beverage")) {
            return new Beverage(nameProduct, productPrice);
        }

        return null;
    }
}
