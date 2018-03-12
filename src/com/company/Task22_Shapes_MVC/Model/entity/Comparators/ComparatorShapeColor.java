package com.company.Task22_Shapes_MVC.Model.entity.Comparators;

import com.company.Task22_Shapes_MVC.Model.entity.Shape;

import java.util.Comparator;

public class ComparatorShapeColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Shape)o1).getShapeColor();
        String color2 = ((Shape)o2).getShapeColor();
        return color1.compareTo(color2);
    }
}
