package com.example.demo;

import java.util.Scanner;
class Fraction {
    public int up;
    public int down;

    public Fraction(int up, int down) {
        this.up = up;
        this.down = down;
    }

    public Fraction multi(Fraction b){
        Fraction fraction = new Fraction(this.up * b.up,this.down * b.down);
        return fraction;
    }

    @Override
    public String toString() {
        return "分数为:" + this.up +
                "/" + this.down ;
    }
}
public class text1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个分数的分子与分母:");
        Fraction a = new Fraction(scanner.nextInt(),scanner.nextInt());
        System.out.println();
        System.out.print("请输入第二个分数的分子与分母:");
        Fraction b = new Fraction(scanner.nextInt(),scanner.nextInt());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.print("相乘结果: ");
        System.out.println(a.multi(b).toString());
    }
}
