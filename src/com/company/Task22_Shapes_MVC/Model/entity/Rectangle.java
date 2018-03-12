package com.company.Task22_Shapes_MVC.Model.entity;

import com.company.Task22_Shapes_MVC.View.ViewShape;

public class Rectangle extends Shape {
    ViewShape view = new ViewShape();
    private double width;
    private double length;
    private double area;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area;
    }

    public Rectangle(double width, String shapeColor) {
        this(width, width, shapeColor);
    }

    public Rectangle(double width, double length, String shapeColor) {
        super(shapeColor);
        this.width = width;
        this.length = length;
        this.shapeColor = shapeColor;
        area = calcArea();
    }

    @Override
    public double calcArea() {
        return width*length;
    }

    @Override
    public void draw() {
        view.printMessage(toString());
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
