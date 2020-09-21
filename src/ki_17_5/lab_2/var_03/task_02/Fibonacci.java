package ki_17_5.lab_2.var_03.task_02;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Fibonacci {

    public static List<Integer> getFibonacciNumber(int limit) {
        return Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(limit + 10)
                .map(n -> n[0])
                .collect(toList());
    }

    public static int firstBiggerThen(int limit) {
        return getFibonacciNumber(limit).stream().filter(n -> n > limit).findFirst().orElse(-1);
    }

}
