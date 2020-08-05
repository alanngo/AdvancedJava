# Advanced Java

## Lambda
- Needs a functional interface
    - can ONLY HAVE 1 abstract method
    - can have any number of non abstract method

- Syntax
```java
// (arguments) -> body
(int arg0, String arg1) -> System.out.println(arg0+" and "+arg1); 
```
- Creating a functional interface:
 ```java
@FunctionalInterface
public interface FunctInterface
{
    void print(Object x);

    default void hello() {System.out.println("hello");}
}
```
- Assigning lambdas to functional interface:
```java
FunctInterface f = (Object x) -> System.out.println(x); //using lambda
FunctInterface f = System.out::println; //using method reference
```
- Calling w/ Lambdas:
```java
List<String> food = new ArrayList<>();

food.add("ramen");
food.add("burger");
food.add("steak");
food.add("sushi");

food.forEach(x->System.out.println(x)); //lambda
food.forEach(System.out::println); //method reference
```