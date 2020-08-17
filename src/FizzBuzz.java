public class FizzBuzz {

    public static void fizzBuzzDoLoop () {

        int num = 1;

        do {

            if (num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }

            num++;

        } while (num < 51);
    }


    public static void fizzBuzzForLoop (int num) {

        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        fizzBuzzDoLoop();
        fizzBuzzForLoop(50);
    }

}
