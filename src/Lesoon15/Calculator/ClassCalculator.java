package Lesoon15.Calculator;

public class ClassCalculator implements Ourcalculator {


    public ClassCalculator(double a, String o, double b) {
        if (o.equals("+")) {
            System.out.println(a + " + " + b + " = " + add(a, b));
            return;
        }
        if (o.equals("-")) {
            System.out.println(a + " + " + b + " = " + sub(a, b));
            return;
        }
        if (o.equals("*")) {
            System.out.println(a + " + " + b + " = " + mul(a, b));
            return;
        }
        if (o.equals("/")) {
            System.out.println(a + " + " + b + " = " + div(a, b));
            return;
        }
        System.out.println("Неизвестная операция");
    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    @Override
    public double mul(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }
}
