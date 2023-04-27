package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
        public void when02to20then2() {
            double expected = 2.8284271247461903;
            int x1 = 0;
            int y1 = 2;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when20to20then2() {
            double expected = 0;
            int x1 = 2;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when13to25then2() {
            double expected = 2.23606797749979;
            int x1 = 1;
            int y1 = 3;
            int x2 = 2;
            int y2 = 5;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

}