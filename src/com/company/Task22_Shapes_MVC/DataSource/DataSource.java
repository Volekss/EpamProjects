package com.company.Task22_Shapes_MVC.DataSource;

import com.company.Task22_Shapes_MVC.Model.entity.Circle;
import com.company.Task22_Shapes_MVC.Model.entity.Rectangle;
import com.company.Task22_Shapes_MVC.Model.entity.Shape;
import com.company.Task22_Shapes_MVC.Model.entity.Triangle;

public class DataSource {
    public static Shape[] getData() {
        return new Shape[]{new Circle(5, "red"),
                new Rectangle(3, 5, "yellow"),
                new Triangle(10, 7, 4, "black"),
                new Triangle(4.4, "grey"),
                new Rectangle(5.5, "white"),
                new Circle(1.3, "dark-blue"),
                new Circle(5, "red"),
                new Rectangle(31, 25, "purple"),
                new Triangle(3, 4, 5, "gold"),
                new Triangle(7.4, "rose"),
                new Rectangle(5.5, "pink"),
                new Circle(1.3, "dark-blue"),
                new Circle(5, "khaki"),
                new Rectangle(3, 5, "yellow"),
                new Triangle(10, 11, 4, "black"),
                new Triangle(4.9, "grey"),
                new Rectangle(51.5, "white"),
                new Circle(1.3, "dark-blue"),
                new Circle(5, "red"),
                new Rectangle(3, 5, "yellow"),
                new Triangle(10, 5, 6, "black"),
                new Triangle(4.4, "grey"),
                new Rectangle(5.5, "white"),
                new Circle(1.3, "dark-blue"),new Circle(5, "red"),
                new Rectangle(3, 5, "yellow"),
                new Triangle(11, 34, 41, "black"),
                new Triangle(4.4, "grey"),
                new Rectangle(5.5, "white"),
                new Circle(1.3, "dark-blue")
        };
    }
}
