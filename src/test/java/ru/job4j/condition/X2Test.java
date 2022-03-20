package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA1B1C1X1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA0B1C1X1() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C0X1() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C1X0() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int out = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, out);
    }
}