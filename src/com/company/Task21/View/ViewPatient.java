package com.company.Task21.View;

import com.company.Task21.Constants.Constants;
import com.company.Task21.Model.Patient;

public class ViewPatient {
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printAllCommands(){
        System.out.println(Constants.IN_PATIENT_LIST_WITH_DIAGNOSE);
        System.out.println(Constants.IN_RANGE_CARD_ID);
        System.out.println(Constants.IN_ORDER_IN_ALPHABET);

    }

    public void printPatientce(Patient[] patients){
        for (Patient patient:patients){
            if (patient != null)
            System.out.println(patient);
        }
    }
}
