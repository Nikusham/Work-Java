package BTU;

import java.util.Scanner;

public class B extends A {
    private int y;

    public void FirstMethod2() {
        var scanner = new Scanner(System.in);
        System.out.println("Value for y: ");
        y = scanner.nextInt();
    }
    public int SecondMethod2() {
        return x * y;
    }
}
