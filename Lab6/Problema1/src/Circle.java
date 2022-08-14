public class Circle extends Shape{
    private double radius;

    public Circle() {
        this(10.0, "red", true);
    }

    public Circle(double radius) {
        this(radius, "red", true);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return radius;}

    public void setRadius(double radius) { this.radius = radius;}

    @Override
    public double getArea() { return Math.PI * this.radius * this.radius;}

    @Override
    public double getPerimeter() { return Math.PI * 2 * this.radius;}

    @Override
    public String toString() {
        return "Color " + this.getColor() + " radius " + this.getRadius() + " filled " + this.isFilled();
    }
}