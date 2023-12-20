package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    void acceptDivideBy2() {
        DivisibleByFilter filter = new DivisibleByFilter(2);
        List<Integer> divisible = Arrays.asList(0, 2, 4);
        List<Integer> notDivisible = Arrays.asList(1, 3, 5);

        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));

        for (int n : notDivisible)
            Assertions.assertFalse(filter.accept(n));

    }

    @Test
    void acceptDivideBy5() {
        DivisibleByFilter filter = new DivisibleByFilter(5);
        List<Integer> divisible = Arrays.asList(0, 5, 10, 40, 240, 1000, 10000);
        List<Integer> notDivisible = Arrays.asList(1, 3, 4, 16, 351, 10001);

        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));

        for (int n : notDivisible)
            Assertions.assertFalse(filter.accept(n));

    }
}
