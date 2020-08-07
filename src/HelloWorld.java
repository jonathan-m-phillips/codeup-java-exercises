public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello World!");
        System.out.println("Hello World!");

        int myFavoriteNumber = 25;

        String myString = "My name is Jonathan, but you can call me Jon if you would like.";
        System.out.println(myString);

        float myNumber;
        myNumber = 3.14F;


        // The difference between pre increment is that the int, y, will print 6 both times
        //      the int, x, will print 5 initially and then 6 after.
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        // This code will break because you cannot set a string to an integer
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;

        // This will throw an error instantly because with the previous example, you are setting
        //    int three to an object. This is trying to pass a string directly to an integer
        // int three = (int) "three";

        int z = 4;
        // z = z + 5; same as code below
        z += 5;
        System.out.println(z);

        int a = 3;
        int b = 4;
        // b = b * a; same as code below
        b *= a;
        System.out.println(b);

        int c = 10;
        int d = 2;
        // x = x / y; same as below
        c /= d;
        System.out.println(c);
        // d = d - c; same as below
        d -= c;
        System.out.println(d);


        // If you assign a value to a numerical variable that is larger than the type can hold,
        //   you will receive an error. If you increment a numeric variable past the capacity,
        //      it will return negative numbers.

    }
}
