package com.demo;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(JUnitPlatform.class)
public class Greentingtest {


    @Test
    public void testSayHello(){
        Greeting greeting = new Greeting();
        assertEquals(greeting.sayHello(),"What's up");
    }
}
