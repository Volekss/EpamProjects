package com.company.Task22_Shapes_MVC.Controller.Utils;

import com.company.Task22_Shapes_MVC.View.Constants.ConstantsView;
import com.company.Task22_Shapes_MVC.View.ViewShape;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputValueWithScanner(ViewShape view){
        view.printStartPoint();
        while (!scanner.hasNextInt()){
            view.printMessage(ConstantsView.ERR_COMMAND);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int inputValueWithScannerDetectShape(ViewShape view){
        view.printAllCommandsToDetectShape();
        while (!scanner.hasNextInt()){
            view.printMessage(ConstantsView.ERR_COMMAND);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
