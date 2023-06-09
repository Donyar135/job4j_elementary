package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {9, 2, 1, 7};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {9, 1, 2, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap4to6() {
        int[] input = {1, 2, 3, 4, 0, 15, -2};
        int source = 4;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, -2, 15, 0};
        assertThat(result).containsExactly(expected);
    }
}