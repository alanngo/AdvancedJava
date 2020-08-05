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

## Logging
- You need log4j.jar to use
- Need to create a "log4j.properties" file

```properties
# writes anything above the given level
log4j.rootLogger=ALL,stdout 
log4j.logger.com.endeca=INFO


# Logger for crawl metrics
log4j.logger.com.endeca.itl.web.metrics=INFO

log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern=%p\t%d{ISO8601}\t%r\t%c\t[%t]\t%m%n
```
![image](log-levels.png)