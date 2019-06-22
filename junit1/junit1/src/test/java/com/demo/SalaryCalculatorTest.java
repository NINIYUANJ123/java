package com.demo;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnitPlatform.class)
public class SalaryCalculatorTest {
    private SalaryCalculator salaryCalculator;

    @BeforeEach
    public void init(){
        salaryCalculator = new SalaryCalculator();
    }

    @Test
    public void testValidBasicSalary(){
        double basicsalary = 10000;
        salaryCalculator.setBasicSalry(basicsalary);

        assertEquals(salaryCalculator.getBasicSalry(),basicsalary);
        assertEquals(salaryCalculator.getGrossSalary(),13450);
    }

    @DisplayName("Incalid Basic salary")
    @Test
    public void testinvalidBasicsalry(){
        double basicSalary = -200;
        assertThrows(IllegalArgumentException.class,
                ()-> salaryCalculator.setBasicSalry(basicSalary));
    }
}
