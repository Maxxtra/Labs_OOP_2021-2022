public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) { this.setSide(width);}

    @Override
    public void setLength(double height) { this.setSide(height);}

    @Override
    public String toString() { return super.toString();}
}