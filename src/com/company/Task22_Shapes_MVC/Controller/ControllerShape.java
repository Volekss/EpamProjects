package com.company.Task22_Shapes_MVC.Controller;

import com.company.Task22_Shapes_MVC.Controller.Utils.InputUtils;
import com.company.Task22_Shapes_MVC.Model.ModelShape;
import com.company.Task22_Shapes_MVC.Model.entity.Enums.ShapeName;
import com.company.Task22_Shapes_MVC.View.ViewShape;

public class ControllerShape {
    ViewShape view = new ViewShape();
    ModelShape model = new ModelShape();

    public ControllerShape (ModelShape model, ViewShape view){
        this.model = model;
        this.view = view;
    }

    public void execute(){
        analyzeCommand(InputUtils.inputValueWithScanner(view));
    }

    private void executeThirdCommand(){
        analyzeCommandToDetectShape(InputUtils.inputValueWithScannerDetectShape(view));
    }

    public void analyzeCommand(int command){
        switch (command){
            case 1:
                model.printAllShapes();
                break;
            case 2:
                model.calcSumArea();
                break;
            case 3:
                executeThirdCommand();
                break;
            case 4:
                model.sortByShapesArea();
                break;
            case 5:
                model.sortByShapesColor();
                break;
        }

    }

    public void analyzeCommandToDetectShape(int command){
        switch (command){
            case 1:
                model.calcSumAreaOfShape(ShapeName.CIRCLE);
                break;
            case 2:
                model.calcSumAreaOfShape(ShapeName.RECTANGLE);
                break;
            case 3:
                model.calcSumAreaOfShape(ShapeName.TRIANGLE);
                break;
        }
    }
}
