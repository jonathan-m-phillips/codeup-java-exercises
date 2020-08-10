public class ControlFlowExercises {
    public static void main(String[] args) {

        // 1: Loop Basics


        // a: While
//        int i = 5;
//
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//
//        // b: Do While
//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);
//
//        int k = 100;
//        do {
//            System.out.println(k);
//            k -= 5;
//        } while (k >=-10);
//
//        long m = 2;
//        do {
//            System.out.println(m);
//            m = m * m;
//        } while(m <= 1000000);
//
//
//        // c: For
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for(int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

        // 2: FizzBuzz
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


    }
}
