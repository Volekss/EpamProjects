package com.company.Task22_Shapes_MVC.Model.entity;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double width, String shapeColor) {
        this(width, width, shapeColor);
    }

    public Rectangle(double width, double length, String shapeColor) {
        super(shapeColor);
        this.width = width;
        this.length = length;
        this.shapeColor = shapeColor;
    }

    @Override
    public double calcArea() {
        return width*length;
    }

    @Override
    public void draw() {
        // TODO: 09-Mar-18 view.print("Draw rectangle");
        System.out.println("");
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
