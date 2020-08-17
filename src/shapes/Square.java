package shapes;

public class Square extends Rectangle {
    private final double side;

    public Square(double length, double width, double side) {
        super(length, width);
        super.length = side;
        super.width = side;
        this.side = side;
    }


    public double getPerimeter() {
        System.out.println(perimeter = 4 * side);
        return perimeter = 4 * side;
    }

    public double getArea () {
        System.out.println(area = Math.pow(side, 2));
        return area = Math.pow(side, 2);
    }


}
