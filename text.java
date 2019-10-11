package com.example.demo;

import java.util.Scanner;
class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double length(){
        double r = Math.sqrt(x*x + y*y);
        return r;
    }
}
class Line {
    Point a;
    Point b;
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public double changdu(){
        double r = Math.sqrt((this.a.x-this.b.x)*(this.a.x-this.b.x)+(this.a.y-this.b.y)*(this.a.y-this.b.y));
        return r;
    }
    public void chuizhi(){
        if (this.a.x == this.b.x)
            System.out.println("此线段垂直!");
        else
            System.out.println("此线段不垂直!");
    }
    public void shuiping(){
        if (this.a.y == this.b.y)
            System.out.println("此线段水平!");
        else
            System.out.println("此线段不水平!");
    }
    public double xielv(){
        double r;
        if (this.a.x-this.b.x != 0)
            r = (this.a.y-this.b.y)/(this.a.x-this.b.x);
        else
            r = 0;
        return r;
    }
    public void zhongdian(){
        double x = (this.a.x + this.b.x)/2;
        double y = (this.a.y + this.b.y)/2;
        System.out.println("中点为: (" + x + "," + y + ")" );
    }

}
public class text {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入x1,y1,x2,y2:");
        x1 = scanner.nextInt();y1 = scanner.nextInt();
        x2 = scanner.nextInt();y2 = scanner.nextInt();
        Line a = new Line(new Point(x1,y1),new Point(x2,y2));
        System.out.println("长度为：" + a.changdu());
        a.shuiping();a.chuizhi();
        System.out.println("斜率为：" + a.xielv());
        a.zhongdian();
    }
}
