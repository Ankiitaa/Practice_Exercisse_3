package com.stackroute.exerthree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectThrowTest {
    ObjectThrow t=new ObjectThrow();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void exceptionCheck() {
        String expectedValue="ArithmeticException ..!! Number divided by 0. This is Finally Block";
        int invalidInput=0;
        String actualValue=t.objectfunction(invalidInput);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void exceptionCheckFail() {
        String expectedValue="This is Finally Block";
        int invalidInput=100;
        String actualValue=t.objectfunction(invalidInput);
        assertEquals(expectedValue,actualValue);
    }
}