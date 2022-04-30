package src.Lambda1;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // Деление на ноль запрещено!
        int d = calc.multiply.apply(5, 5);

        int e = calc.pow.apply(5);
        int f = calc.abs.apply(6);

        calc.println.accept(c);
        System.out.println(calc.isPositive.test(a));
    }
}