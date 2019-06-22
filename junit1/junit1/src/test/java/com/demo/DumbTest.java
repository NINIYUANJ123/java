package com.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@RunWith(JUnitPlatform.class)
public class DumbTest {
    private static Dumb dumb;
    @BeforeAll    //全部检测完成
    static void init(){
        dumb = new Dumb();
    }
    @Test
    public void testSum(){
        assertTrue(dumb.sum(1,2,3) == 6,"sum shuould return 5");
    }

    @Test
    public void groupAssertions(){
        int[] numbers = dumb.getNumbers(0,1,3,5,8);
        assertAll("numbers",
                ()-> assertEquals(numbers[0],0),
                ()-> assertEquals(numbers[1],3),
                ()-> assertEquals(numbers[4],8));
    }
    @Test
    public void trueAssumption(){
        assumeTrue(false);
        assertEquals(dumb.sum(5,2),7);
    }
    @Test
    public void assumptionThat(){
        String sys = "MAC";
        assumingThat(
                sys.equals("WIN"),
                ()-> assertEquals(dumb.sum(2+2),4));
        assumingThat(
                sys.equals("MAc"),
                ()-> System.out.println("sys valid")
        );
    }
}
