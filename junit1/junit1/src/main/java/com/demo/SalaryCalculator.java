package com.demo;

public class SalaryCalculator {
    private double basicSalry;

    public double getBasicSalry() {
        return basicSalry;
    }

    public void setBasicSalry(double basicSalry) {
        if (basicSalry < 0){
            throw new IllegalArgumentException("负数工资"); //抛出异常
        }
        this.basicSalry = basicSalry;
    }

    public double getGrossSalary(){
        return this.basicSalry + getSocialInsurance() + getAllowance();
    }

    private double getAllowance() {
        return this.basicSalry / 10;
    }

    private double getSocialInsurance() {
        return this.basicSalry * 0.25;
    }
}
