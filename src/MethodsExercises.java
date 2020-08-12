import java.io.Serializable;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(addition(1, 2));

        System.out.println(subtraction(3, 4));

        System.out.println(multiplication(5, 6));

        System.out.println(division(8, 0));

        System.out.println(remainder(17, 3));

    }

    // 1: Basic Arithmetic
    public static double addition (double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction (double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication (double num1, double num2) {
        return num1 * num2;
    }


    public static Serializable division (double num1, double num2) {
        String undefined = "undefined";
        if (num2 == 0) {
            return undefined;
        }

        return num1 / num2;

    }

    public static double remainder (double num1, double num2) {
        return num1 % num2;
    }

}
