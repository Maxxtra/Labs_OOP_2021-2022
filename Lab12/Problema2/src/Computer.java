public class Computer extends Product{
    public Computer(String name, Float price) {
        super(name, price);
    }

    @Override
    public Float getPriceReduced() {
        return (float) (super.getPrice() - super.getPrice() * 0.1);
    }
}