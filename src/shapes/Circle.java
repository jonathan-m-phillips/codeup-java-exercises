package shapes;

import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);

    public double radius = 0;
    private double area = 0;
    private double circumference = 0;
    private int count = 1;

    private double PI = Math.PI;

    public void Circle(double radius) {
        this.radius = radius;
    }

    public double userRadius() {
        System.out.println("What is the radius of your circle in inches?");
        String userInput = scanner.nextLine();
        radius = Double.parseDouble(userInput);
        return radius;
    }

    public double getArea() {
        area = (PI * (radius * radius));
        System.out.printf("Circle area = %.2f", area);
        return area;
    }

    public double getCircumference() {
        circumference = (2 * PI * radius);
        System.out.printf("\nCircle circumference = %.2f", circumference);
        return circumference;
    }

    public void yesNo() {
        boolean userAgrees = true;
        boolean agree = true;
        do {
            System.out.println("\nDo you want to add another circle? y/n:");
            String yesNo = scanner.nextLine();
            if (yesNo.toLowerCase().equals("y")) {
                count += 1;
                System.out.printf("\nYou are on circle #%d.", count);
                System.out.println("\nWhat is the radius of your circle in inches?");
                String userInput = scanner.nextLine();
                double radius = Double.parseDouble(userInput);
                Circle(radius);
                getArea();
                getCircumference();
            } else {
                userAgrees = false;
                break;
            }
        } while (userAgrees);
    }
}


