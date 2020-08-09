package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    static void log(Object o){System.out.println(o);}

    // intermediate aperations
    /**
     * map
     * filter
     * sorted
     * */
    static List<Integer> removeOddNumbersFilter(List<Integer> li) // using the filter method
    {
        return li.stream().
                filter(x -> (x % 2 == 0)).
                collect(Collectors.toList());
    }
    static List<Integer> multiplyBy2(List<Integer> li) // using the map method
    {
        return li.stream().
                map(x -> x*2).
                collect(Collectors.toList());
    }

    static List<String> getSorted(List<String> li) //using the sorted method
    {
        return li.stream().
                sorted().
                collect(Collectors.toList());
    }

    //advanced operations
    /**
     * collect
     * forEach
     * reduced
     * */

    public static void main(String[] args)
    {
        example0();
        example1();
    }
    static void example0()
    {
        List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> rendered1 = removeOddNumbersFilter(numbers);
        List<Integer> rendered2 = multiplyBy2(numbers);
        log("Using a the filter method: "+rendered1);
        log("Using a the map method: "+rendered2);
        List<String> motherboards = Arrays.asList("MSI", "Asus", "Gigabyte", "EVGA", "Asrock");
        List<String> sorted = getSorted(motherboards);
        log("using the sorted method: "+sorted);
    }
    static void example1()
    {
        //TODO
    }
}
