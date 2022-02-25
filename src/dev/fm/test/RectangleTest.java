package dev.fm.test;

import dev.fm.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void giverCalculateArea_whenMultiplySides_thenSucceed(){
        Rectangle rectangle = new Rectangle(5d, 2d);

        double actual = rectangle.calculateArea();

        assertEquals(10d, actual);
    }

    @Test
    void giverCalculatePerimeter_whenSumSides_thenSucceed(){
        Rectangle rectangle = new Rectangle(5d, 2d);

        double actual = rectangle.calculatePerimeter();
        assertEquals(14d, actual);
    }

}