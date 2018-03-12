package com.company.Task21.View;


import com.company.Task21.Constants.ConstantPhrases;
import com.company.Task21.Model.Entity.Patient;

public class ViewPatient {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, String param) {
        System.out.println(message + param);
    }


    public void printAllCommands() {
        System.out.println(ConstantPhrases.IN_PATIENT_LIST_WITH_DIAGNOSE);
        System.out.println(ConstantPhrases.IN_RANGE_CARD_ID);
        System.out.println(ConstantPhrases.IN_ORDER_IN_ALPHABET);

    }

    public void printPatientce(Patient[] patients) {
        for (Patient patient : patients) {
            if (patient != null)
                System.out.println(patient);
        }
    }
}
