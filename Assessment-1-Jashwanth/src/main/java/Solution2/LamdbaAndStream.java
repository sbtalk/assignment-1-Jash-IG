package Solution2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdbaAndStream {
    public static void main(String[] args) {
        //Create a List of 15 integers.
        List<Integer> listOfIntegers = Arrays.asList( 1, 2, 11, 12, 21, 22, 31, 32, 41, 42, 51, 52);

        //Print Even Numbers
        System.out.println("Even Numbers:");
        listOfIntegers.stream().filter(n -> n%2 == 0).forEach(System.out::println);

        //Sum of Numbers using reduce()
        int sum = listOfIntegers.stream().reduce((x, y) -> (x + y)).get();
        System.out.println("Sum of all numbers: "+ sum);

        //Sort in descending order
        List<Integer> descendingOrder = listOfIntegers.stream().sorted((x, y)-> y.compareTo(x)).collect(Collectors.toList());
        System.out.println("Descending order: "+descendingOrder);

    }
}
