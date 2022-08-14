public class Book extends Product {
    public Book(String name, Float price) {
        super(name, price);
    }

    @Override
    public Float getPriceReduced() {
        return (float) (super.getPrice() - super.getPrice() * 0.15);
    }
}