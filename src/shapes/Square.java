package shapes;

public class Square extends Quadrilateral {
    protected double side;

    public Square(double side) {
        this.width = side;
        this.length = side;
        this.side = side;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
