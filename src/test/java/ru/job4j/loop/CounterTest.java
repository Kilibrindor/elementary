package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSumNumbersFrom0To5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSumEvenNumbersFrom0To5Then6() {
        int start = 0;
        int finish = 5;
        int expected = 6;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }
}