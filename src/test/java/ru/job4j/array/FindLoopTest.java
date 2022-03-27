package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] array = {5, 4, 3, 2};
        int element = 5;
        int expected = 0;
        int actual = FindLoop.indexOf(array, element);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenArrayHas5Then10() {
        int[] array = {5, 4, 3, 2};
        int element = 10;
        int expected = -1;
        int actual = FindLoop.indexOf(array, element);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenArrayHas5Then2() {
        int[] array = {5, 4, 3, 2};
        int element = 2;
        int expected = 3;
        int actual = FindLoop.indexOf(array, element);
        Assert.assertEquals(expected, actual);
    }
}