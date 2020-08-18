package shapes;

import org.w3c.dom.css.Rect;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Perimeter of box1 = " + box1.getPerimeter());;
        System.out.println("Area of box1 = " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("Perimeter of box2 = " + box2.getPerimeter());
        System.out.println("Area of box2 = " + box2.getArea());

    }

}
