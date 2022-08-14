public class Beverage extends Product {
    public Beverage(String name, Float price) {
        super(name, price);
    }

    @Override
    public Float getPriceReduced() {
        return (float) (super.getPrice() - super.getPrice() * 0.05);
    }
}