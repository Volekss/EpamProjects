package com.company.Task21.Model;

import com.company.Task21.Constants.ConstantPhrases;
import com.company.Task21.DataSource.DataSource;
import com.company.Task21.Model.Entity.Patient;
import com.company.Task21.Utils.ComparatorCardID;
import com.company.Task21.Utils.ComparatorFirstName;
import com.company.Task21.View.ViewPatient;

import java.util.Arrays;

public class ModelPatient {
    private Patient[] patients;
    private ViewPatient view = new ViewPatient();

    public ModelPatient() {
        patients = DataSource.getData();
        view.printPatientce(patients);
    }


    public Patient[] getPatientList(String diagnose) {
        Patient[] returnPatience = new Patient[patients.length];
        int diagnoseNumber = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getDiagnose().equals(diagnose)){
                returnPatience[diagnoseNumber] = patients[i];
                diagnoseNumber++;
            }
        }
        if (diagnoseNumber == 0){
            view.printMessage(ConstantPhrases.ERR_NO_PATIENTS_FOUND_WITH_DIAGNOSE, diagnose);
            return null;
        }
        view.printPatientce(returnPatience);
        return returnPatience;
    }

    public void findPatientsInRange(int startRange, int endRange) {
        Patient[] returnPatience = new Patient[patients.length];
        int patienceFoundNumber = 0;
        if (endRange <= startRange) {
            view.printMessage(ConstantPhrases.ERR_END_RANGE_LOWER_THAN_START_RANGE);
            return;
        }

        sortPatientsByCardID();

        for (int i = 0; i < patients.length; i++) {
            if((patients[i].getCardID() >= startRange)&&(patients[i].getCardID() <= endRange)){
                returnPatience[patienceFoundNumber] = patients[i];
                patienceFoundNumber++;
            }
        }
        if (patienceFoundNumber == 0){
            view.printMessage(ConstantPhrases.ERR_NO_PATIENTS_FOUND_IN_THE_RANGE +(startRange+endRange));
            return ;
        }
        view.printPatientce(returnPatience);

    }

    public void sortPatientsByName() {
        Arrays.sort(patients, new ComparatorFirstName());
        view.printPatientce(patients);

    }

    public void sortPatientsByCardID(){
        Arrays.sort(patients, new ComparatorCardID());
    }

}
