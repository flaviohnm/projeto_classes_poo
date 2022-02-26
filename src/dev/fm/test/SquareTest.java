package dev.fm.test;

import dev.fm.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @BeforeEach
    void setup(){
        square = new Square (8d, 8d);
    }

    @Test
    void giverCalculateArea_whenMultiplySides_thenSucceed(){
        //Square square = new Square(8d, 8d);

        double actual = square.calculateArea();

        assertEquals(64d, actual);
    }

    @Test
    void giverCalculatePerimeter_whenSumSides_thenSucceed(){
        //Square square = new Square (8d, 8d);

        //square.setSideA(5d);
        //square.setSideB(5d);

        double actual = square.calculatePerimeter();

        assertEquals(32d, actual);
    }

}