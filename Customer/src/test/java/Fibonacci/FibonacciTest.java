package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void test() {
        //Given
        Fibonacci fibonacci = new Fibonacci();
        //When
        fibonacci.fibonacci(10);
        //Then
        System.out.println(fibonacci.fibonacci(6));
    }

}