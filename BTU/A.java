package BTU;

import java.util.Scanner;

public class A {
    public int x;

    public A() {
        System.out.println("Hello");
    }

    public void FirstMethod() {
        var scanner = new Scanner(System.in);
        System.out.print("Value for x: ");
        x = scanner.nextInt();
    }
    public void SecondMethod() {
        System.out.println(x + 12);
    }
    public void ThirdMethod() {
        if(x % 2 == 0) {
            System.out.println("luwi");
        }
        else if(x % 2 == 1)
            System.out.println("kenti");
    }
}
