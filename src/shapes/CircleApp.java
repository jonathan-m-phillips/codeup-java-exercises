package shapes;

import java.util.Scanner;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        double radius = input.getDouble();

        Circle circle = new Circle (radius);
        System.out.printf("radius: %.2f\n", circle.userRadius());
        System.out.printf("area: %.2f\n", circle.getArea());
        System.out.printf("circumference: %.2f\n", circle.getCircumference());

    }
}
