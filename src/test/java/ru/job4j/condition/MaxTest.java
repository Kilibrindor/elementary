package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne2Two3Three4ThenMax4() {
        int one = 2;
        int two = 3;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne2Two3Three4Four5ThenMax5() {
        int one = 2;
        int two = 3;
        int three = 4;
        int four = 5;
        int result = Max.max(one, two, three, four);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}