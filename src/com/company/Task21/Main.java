package com.company.Task21;

import com.company.Task21.Controller.ControllerPatient;
import com.company.Task21.Model.ModelPatient;
import com.company.Task21.View.ViewPatient;

public class Main {


    public static void main(String[] args) {


        ViewPatient view = new ViewPatient();
        ModelPatient model = new ModelPatient();
        ControllerPatient controller = new ControllerPatient(model, view);
        controller.execute();
    }

}
