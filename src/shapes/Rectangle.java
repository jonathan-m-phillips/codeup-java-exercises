package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    protected double area;
    protected double perimeter;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea () {
        System.out.println(area = length * width);
        return area = length * width;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter () {
        System.out.println(perimeter = 2 * length + 2 * width);
        return perimeter = 2 * length + 2 * width;
    }

    public void setPerimeter (double perimeter) {
        this.perimeter = perimeter;
    }

}
