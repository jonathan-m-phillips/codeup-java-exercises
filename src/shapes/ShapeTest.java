package shapes;

import org.w3c.dom.css.Rect;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        box1.getPerimeter();
        box1.getArea();

        Rectangle box2 = new Square(5, 4, 5);
        box2.getPerimeter();
        box2.getArea();

    }

}
