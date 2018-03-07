package com.company.Task21.Controller;

import com.company.Task21.Constants.Commands;
import com.company.Task21.Model.ModelPatient;
import com.company.Task21.Constants.Constants;
import com.company.Task21.View.ViewPatient;

public class ControllerPatient {
    private ModelPatient model;
    private ViewPatient view;
    String command;


    public ControllerPatient(ModelPatient model, ViewPatient view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        analyzeCommand(InputUtility.inputValueWithScanner(view));
    }

    public void analyzeCommand(String command) {
        if (command == null || command == "") {
            view.printMessage(Constants.ERR_INCORRECT_COMMAND);
            return;
        }
        if (command == Constants.commands[2]) { //sort
            model.sortPatients();
        } else {
            if (command.startsWith(Constants.commands[0])) {//getList{
                analyzeGetListParam(command);
            } else {
                if (command.startsWith(Constants.commands[1]))//range
                    analyzeRangeParam(command);
                else {
                    view.printMessage(Constants.ERR_INCORRECT_COMMAND);
                    return;
                }
            }

        }


    }

    private void analyzeGetListParam(String command) {
        //check param for diagnose
        String[] commandAndParam = command.split("=");
        String param = commandAndParam[1];
        int counter = 0;
        for (int i = 0; i < Constants.diagnoses.length; i++) {
            if (param.equals(Constants.diagnoses[i])) {
                model.getPatientList(param);
                counter++;
                break;
            }
        }
        if (counter==0)
        view.printMessage(Constants.ERR_INCORRECT_COMMAND);
        return;
    }

    private void analyzeRangeParam(String command) {
        //check for range
        String[] commandAndParam = command.split(" ");
        String param = commandAndParam[1];
        String[] params = param.split("-");
        int startRange = Integer.parseInt(params[0]);
        int endRange = Integer.parseInt(params[1]);
        if ((startRange > endRange) || startRange < 0 || endRange < 0) {
            view.printMessage(Constants.ERR_INCORRECT_COMMAND);
            return;
        }
        model.findPatientsInRange(startRange, endRange);

    }
}
