package com.company.Task22_Shapes_MVC.Model.entity;

import com.company.Task22_Shapes_MVC.View.ViewShape;

public class Triangle extends Shape {
    ViewShape view = new ViewShape();
    private double b;
    private double a;
    private double c;
    private double area;


    public Triangle(double a,String shapeColor) {
        this(a, a, a, shapeColor);
    }

    public Triangle(double a, double b, double c, String shapeColor) {
        super(shapeColor);

        this.a = a;
        this.b = b;
        this.c = c;
        area = calcArea();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calcArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void draw() {
        view.printMessage(toString());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + area +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
