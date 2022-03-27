package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] array = {1, 2, 3, 4};
        int source = 0;
        int dest = array.length - 1;
        int[] actual = SwitchArray.swap(array, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSwap0To2() {
        int[] array = {1, 2, 3, 4};
        int source = 0;
        int dest = 2;
        int[] actual = SwitchArray.swap(array, source, dest);
        int[] expected = {3, 2, 1, 4};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSwap2To5() {
        int[] array = {1, 2, 3, 4, 5};
        int source = 2;
        int dest = 4;
        int[] actual = SwitchArray.swap(array, source, dest);
        int[] expected = {1, 2, 5, 4, 3};
        Assert.assertArrayEquals(expected, actual);
    }
}