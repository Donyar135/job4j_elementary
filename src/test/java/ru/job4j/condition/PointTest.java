package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2.82;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
        public void when02to20then2dot83() {
            double expected = 2.83;
            Point a = new Point(0, 2);
            Point b = new Point(2, 0);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when20to20then0() {
            double expected = 0;
            Point a = new Point(2, 0);
            Point b = new Point(2, 0);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when13to25then2dot24() {
            double expected = 2.24;
            Point a = new Point(1, 3);
            Point b = new Point(2, 5);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

}