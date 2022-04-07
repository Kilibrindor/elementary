package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point point = new Point(0, 0);
        Point point1 = new Point(2, 0);
        double expected = 2;
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to34then5() {
        Point point = new Point(1, 1);
        Point point1 = new Point(3, 4);
        double expected = 3.6;
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to57then7() {
        Point point = new Point(2, 3);
        Point point1 = new Point(5, 7);
        double expected = 5;
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}