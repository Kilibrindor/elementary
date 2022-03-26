package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] expected = {0, 1, 4};
        int[] actual = Square.calculate(bound);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] expected = {0, 1, 4, 9, 16};
        int[] actual = Square.calculate(bound);
        Assert.assertArrayEquals(expected, actual);
    }
}