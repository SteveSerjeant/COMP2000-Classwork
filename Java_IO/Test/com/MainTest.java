package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        String message = "Hello!";
        assertEquals("Hello!", message);
    }



    @Test
    public void addNumbers() {
        Main test = new Main();
        int result = test.addNumbers(3, 5);
        assertEquals(8, result);

    }

    @Test
    public void testAddStrings(){
        Main test1 = new Main();
        String result2 = test1.addStrings("Steve", "Serjeant");
        assertEquals("SteveSerjeant", result2);
    }

    @Test
    public void sayHello() {
        Main test2 = new Main();
        String output = test2.sayHello();
        assertEquals("Hello World!", output);
    }
}