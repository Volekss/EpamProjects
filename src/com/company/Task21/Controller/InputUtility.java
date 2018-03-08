package com.company.Task21.Controller;


import com.company.Task21.Constants.ConstantPhrases;
import com.company.Task21.View.ViewPatient;

import java.util.Scanner;

public class InputUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputValueWithScanner(ViewPatient view){
        view.printMessage(ConstantPhrases.START_POINT);
        view.printAllCommands();
        while (!scanner.hasNextLine()){
            view.printMessage(ConstantPhrases.ERR_INCORRECT_COMMAND);
            scanner.nextLine();
        }
        return scanner.nextLine();
    }
}
