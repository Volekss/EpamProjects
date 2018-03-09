package com.company.Task22_Shapes_MVC.Model.entity;

public class Triangle extends Shape {
    private int b;
    private int a;
    private int c;


    public Triangle(int a,String shapeColor) {
        this(a, a, a, shapeColor);
    }

    public Triangle(int a, int b, int c, String shapeColor) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public double calcArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void draw() {
        //todo view.sout
        System.out.println();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
