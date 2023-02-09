package Lesoon15.Calculator;

public class Main {
    public static void main(String[] args) {


        if (args.length >= 3) {
            new ClassCalculator(Double.valueOf(args[0]), args[1],
                    Double.valueOf(args[2]));
        } else {
            System.out.println("Введите параметры типа 1+1");
           return;
        }
    }
}