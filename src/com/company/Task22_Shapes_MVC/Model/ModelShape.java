package com.company.Task22_Shapes_MVC.Model;

import com.company.Task22_Shapes_MVC.DataSource.DataSource;
import com.company.Task22_Shapes_MVC.Model.entity.Circle;
import com.company.Task22_Shapes_MVC.Model.entity.Comparators.ComparatorShapeArea;
import com.company.Task22_Shapes_MVC.Model.entity.Comparators.ComparatorShapeColor;
import com.company.Task22_Shapes_MVC.Model.entity.Enums.ShapeName;
import com.company.Task22_Shapes_MVC.Model.entity.Rectangle;
import com.company.Task22_Shapes_MVC.Model.entity.Shape;
import com.company.Task22_Shapes_MVC.Model.entity.Triangle;
import com.company.Task22_Shapes_MVC.View.ViewShape;

import java.util.Arrays;

public class ModelShape {
    ViewShape view = new ViewShape();
    private Shape[] shapes;


    public ModelShape(){
        shapes = DataSource.getData();
        //view.printShapeArr(shapes);
    }

    public double calcSumArea() {
        double res = 0.0;

        for (Shape s : shapes) {
            res += s.getArea();
        }
        view.printMessage("The sum area is: " + res);
        return res;
    }

    public void printShapeArr(Shape[] shapes) {
        for (Shape s : shapes)
            view.printShape(s);
    }

    public void printAllShapes() {
        for (Shape s : shapes)
            view.printShape(s);
    }

    public double calcSumAreaOfShape(ShapeName shapeName) {
        double res = 0.0;
        switch (shapeName) {
            case CIRCLE:
                res += calcCircleSum();
                break;
            case TRIANGLE:
                res += calcTriangleSum();
                break;
            case RECTANGLE:
                res += calcRectangleSum();
                break;
        }
        view.printMessage("The sum area of" + shapeName + " is: " + res);
        return res;
    }

    private double calcCircleSum() {
        double res = 0.0;

        for (Shape s : shapes) {
            if (s instanceof Circle)
                res += s.calcArea();
        }
        return res;
    }


    private double calcTriangleSum() {
        double res = 0.0;

        for (Shape s : shapes) {
            if (s instanceof Triangle)
                res += s.calcArea();
        }
        return res;
    }

    private double calcRectangleSum() {
        double res = 0.0;

        for (Shape s : shapes) {
            if (s instanceof Rectangle)
                res += s.calcArea();
        }
        return res;
    }

    public void sortByShapesArea() {
        Arrays.sort(shapes, new ComparatorShapeArea());
        printAllShapes();
    }

    public void sortByShapesColor() {
        Arrays.sort(shapes, new ComparatorShapeColor());
        printAllShapes();
    }

}
