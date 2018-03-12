package com.company.Task22_Shapes_MVC.Model.entity.Comparators;

import com.company.Task22_Shapes_MVC.Model.entity.Shape;

import java.util.Comparator;

public class ComparatorShapeArea implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        double shapeArea1 = ((Shape) o1).calcArea();
        double shapeArea2 = ((Shape) o2).calcArea();
        if (shapeArea1 < shapeArea2) return -1;
        if (shapeArea1 > shapeArea2) return 1;

        return 0;
    }
}
