package main;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 3, 4, 5, 6, 7, 78, 9, 7, 6);

        nums.stream()
                .filter(n -> n % 2 == 1) // filter to get odd numbers
                .map(n -> n * 2)
                .sorted()
                .forEach(n -> System.out.println(n));

    }
}
