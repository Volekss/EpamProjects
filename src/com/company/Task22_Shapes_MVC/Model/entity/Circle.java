package com.company.Task22_Shapes_MVC.Model.entity;

import com.company.Task22_Shapes_MVC.View.ViewShape;

public class Circle extends Shape {
    private ViewShape view = new ViewShape();
    private double radius;
    private double area;

    public Circle(double radius, String shapeColor) {
        super(shapeColor);
        this.radius = radius;
        area = calcArea();
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        view.printMessage(toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
