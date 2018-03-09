package com.company.Task22_Shapes_MVC.Model.entity;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String shapeColor) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        // TODO: 09-Mar-18 view.print
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
