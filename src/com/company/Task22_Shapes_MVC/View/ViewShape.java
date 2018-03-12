package com.company.Task22_Shapes_MVC.View;

import com.company.Task22_Shapes_MVC.Model.entity.Shape;
import com.company.Task22_Shapes_MVC.View.Constants.ConstantsView;

public class ViewShape {

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printStartPoint(){
        System.out.println(ConstantsView.START_POINT);
        printAllCommands();
    }

    public void printAllCommands(){
        System.out.println(ConstantsView.COMMAND_1);
        System.out.println(ConstantsView.COMMAND_2);
        System.out.println(ConstantsView.COMMAND_3);
        System.out.println(ConstantsView.COMMAND_4);
        System.out.println(ConstantsView.COMMAND_5);
    }

    public void printAllCommandsToDetectShape(){
        System.out.println(ConstantsView.START_POINT);
        System.out.println(ConstantsView.COMMAND_3_1);
        System.out.println(ConstantsView.COMMAND_3_2);
        System.out.println(ConstantsView.COMMAND_3_3);
    }

    public void printShape(Shape shape){
        System.out.println(shape.toString());
    }

    public void printShapeArr(Shape[] shapes){
        for (Shape s: shapes)
            s.draw();
    }
}
