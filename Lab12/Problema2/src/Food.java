public class Food extends Product{
    public Food(String name, Float price) {
        super(name, price);
    }

    @Override
    public Float getPriceReduced() {
        return (float) (super.getPrice() - super.getPrice() * 0.2);
    }
}