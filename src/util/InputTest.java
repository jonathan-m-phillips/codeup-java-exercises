package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input ();

        input.getString();

        input.yesNo();

        input.getInt(50, 100);

        input.getDouble(1, 100);
    }
}
