package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    static void lambda0()
    {
        // how to create and instantiate functional interface that prints
        FunctInterface f = System.out::println;

        f.print("You planted grass?");
        f.print("we serve food here sir");
    }

    static void lambda1()
    {
        // example of invoking a lambda
        List<String> food = new ArrayList<>();
        food.add("ramen");
        food.add("burger");
        food.add("steak");
        food.add("sushi");

        food.forEach(System.out::println);

    }

    public static void main(String[] args)
    {
        lambda0();
        lambda1();
    }


}
