package shapes;

public class ShapeTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(10);
        System.out.println("square perimeter = " + myShape.getPerimeter());;
        System.out.println("square area = " + myShape.getArea());

        myShape = new Rectangle(10, 12);
        System.out.println("rectangle perimeter = " + myShape.getPerimeter());
        System.out.println("rectangle area = " + myShape.getArea());
    }

}


