package lambdas;
@FunctionalInterface
public interface FunctInterface
{
    // functional interfaces can only have 1 abstract method
    // can have any number of non-abstract methods
    void print(Object x);

    default void hello() {System.out.println("hello"); }
}
