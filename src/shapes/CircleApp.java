package shapes;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle ();
        circle.Circle(circle.userRadius());
        circle.getArea();
        circle.getCircumference();
        circle.yesNo();
    }
}
