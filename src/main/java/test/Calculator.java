package test;

public class Calculator {
    @FunctionalInterface
    public interface BinaryOperator<T> {
        T apply(T x, T y);
    }

    @FunctionalInterface
    public interface UnaryOperator<T> {
        T apply(T x);
    }

    @FunctionalInterface
    public interface Predicate<T> {
        boolean apply(T x);
    }

    @FunctionalInterface
    public interface Supplier<T> {
        Calculator get();
    }

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T x);
    }

    public static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> devide = (x, y) -> ((x == 0) || (y == 0)) ? 0 : x / y;
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    public Predicate<Integer> isPositive = x -> x > 0;
    public Consumer<Integer> println = System.out::println;
}
