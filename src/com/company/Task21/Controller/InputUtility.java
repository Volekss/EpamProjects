package com.company.Task21.Controller;

import com.company.Task21.Constants.Constants;
import com.company.Task21.View.ViewPatient;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputValueWithScanner(ViewPatient view){
        view.printMessage(Constants.START_POINT);
        view.printAllCommands();
        while (!scanner.hasNext()){
            view.printMessage(Constants.ERR_INCORRECT_COMMAND);
            scanner.next();
        }
        return scanner.next();
    }
}
