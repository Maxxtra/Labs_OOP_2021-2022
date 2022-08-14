public class Rectangle extends Shape {
    private double width, height;

    public Rectangle() {
        this("red", true, 15.2, 13.4);
    }

    public Rectangle(double width, double height) {
        this("red", true, width, height);
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width;}

    public void setWidth(double width) { this.width = width;}

    public double getLength() { return height;}

    public void setLength(double height) { this.height = height;}

    @Override
    public double getArea() { return this.height * this.width;}

    @Override
    public double getPerimeter() { return 2 * (this.width + this.height);}

    @Override
    public String toString() {
        return "Width: " + this.width + " Height: " + this.height + " color: " + this.getColor();
    }
}