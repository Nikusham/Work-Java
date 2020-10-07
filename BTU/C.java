package BTU;

import java.util.Scanner;

public class C {
    private int a;
    private int b;
    private int c;

    public void FirstMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value for A: ");
        a = scanner.nextInt();
        System.out.print("Value for B: ");
        b = scanner.nextInt();
        System.out.print("Value for C: ");
        c = scanner.nextInt();
    }
    public int SecondMethod() {
        String intToStr = Integer.toString(a);
        StringBuilder str = new StringBuilder();
        for(var i = intToStr.length() - 2; i < intToStr.length(); i++) {
            str.append(intToStr.charAt(i));
        }
        return Integer.parseInt(str.toString());
    }
    public int ThirdMethod() {
        String intToStr = Integer.toString(b);
        return Integer.parseInt((new StringBuilder().append(intToStr.charAt(0))).toString());
    }
    public int FourthMethod() {
        String intToStr = Integer.toString(c);
        var sum = 0;

        for(var i = 0; i < intToStr.length(); i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(intToStr.charAt(i));
            sum += Integer.parseInt(builder.toString());
        }
        return sum;
    }
    public int FifthMethod() {
        var firstValue = SecondMethod();
        var secondValue = ThirdMethod();
        var product = firstValue * secondValue;
        System.out.println(product);
        return product;
    }
    public void SixthMethod() {
        var firstValue = ThirdMethod();
        var secondValue = FifthMethod();
        System.out.println(firstValue + secondValue);
    }

}
