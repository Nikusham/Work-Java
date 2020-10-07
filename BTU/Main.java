package BTU;

public class Main {

    public static void main(String[] args) {
        C c = new C();
        c.FirstMethod();
        c.SecondMethod();
        c.ThirdMethod();
        c.FourthMethod();
        c.FifthMethod();
        c.SixthMethod();

        A a = new A();
        a.FirstMethod();
        a.SecondMethod();
        a.ThirdMethod();

        B b = new B();
        b.FirstMethod2();
        b.SecondMethod2();

        Algorithm algo = new Algorithm();
        algo.Method();
    }
}
