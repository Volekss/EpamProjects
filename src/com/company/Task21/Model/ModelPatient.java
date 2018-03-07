package com.company.Task21.Model;

import com.company.Task21.View.ViewPatient;

public class ModelPatient {
    private Patient[] patients = new Patient[6];
    private String[] commandArr = {"getList", "range", "sort"};
    public ViewPatient view = new ViewPatient();
    public boolean error = false;

    public ModelPatient() {
        Patient patient1 = new Patient();
        patient1.setFirstName("John");
        patient1.setLastName("Travolta");
        patient1.setAddress("Soloma district");
        patient1.setDiagnose("diagnose1");
        patient1.setPatronymic("Ovych");
        patient1.setCardID(12389);
        patient1.setPhoneNumber(380123456087L);
        Patient patient2 = new Patient();
        patient2.setFirstName("Joshua");
        patient2.setLastName("Derick");
        patient2.setAddress("Pechersk district");
        patient2.setDiagnose("diagnose2");
        patient2.setPatronymic("Ovych");
        patient2.setCardID(45389);
        patient2.setPhoneNumber(380127656087L);
        Patient patient3 = new Patient();
        patient3.setFirstName("Nickolas");
        patient3.setLastName("Denis");
        patient3.setAddress("Obolon district");
        patient3.setDiagnose("diagnose2");
        patient3.setPatronymic("Ovych");
        patient3.setCardID(12209);
        patient3.setPhoneNumber(380123494087L);
        Patient patient4 = new Patient();
        patient4.setFirstName("Kelvin");
        patient4.setLastName("Kurt");
        patient4.setAddress("Shevchenk district");
        patient4.setDiagnose("diagnose3");
        patient4.setPatronymic("Ovych");
        patient4.setCardID(389);
        patient4.setPhoneNumber(380683456087L);
        Patient patient5 = new Patient();
        patient5.setFirstName("Tim");
        patient5.setLastName("Cook");
        patient5.setAddress("Silicon district");
        patient5.setDiagnose("diagnose3");
        patient5.setPatronymic("Ovychg");
        patient5.setCardID(4234);
        patient5.setPhoneNumber(3801230846087L);
        Patient patient6 = new Patient();
        patient6.setFirstName("Johny");
        patient6.setLastName("Ivy");
        patient6.setAddress("Redmond district");
        patient6.setDiagnose("diagnose3");
        patient6.setPatronymic("Ovych");
        patient6.setCardID(86523);
        patient6.setPhoneNumber(380453456087L);


        patients[0] = patient1;
        patients[1] = patient2;
        patients[2] = patient3;
        patients[3] = patient4;
        patients[4] = patient5;
        patients[5] = patient6;
        view.printPatientce(patients);

    }



    public void execute(String command, String param) {}

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
            error = true;
            return null;
        }
        view.printPatientce(returnPatience);
        return returnPatience;
    }

    public Patient[] findPatientsInRange(int startRange, int endRange) {
        Patient[] returnPatience = new Patient[patients.length];
        int patienceFoundNumber = 0;
        if (endRange >= startRange)
            return null;
        // TODO: 05-Mar-18 @param by cardID
        sortPatients("cardID");

        for (int i = 0; i < patients.length; i++) {
            if((patients[i].getCardID() >= startRange)&&(patients[i].getCardID() <= endRange)){
                returnPatience[patienceFoundNumber] = patients[i];
                patienceFoundNumber++;
            }
        }
        if (patienceFoundNumber == 0){
            error = true;
            return null;
        }
        view.printPatientce(patients);
        return returnPatience;

    }

    public Patient[] sortPatients(String sortBy) {
        view.printPatientce(patients);
        return patients;

    }
    public Patient[] sortPatients() {
        return sortPatients("byLastName");

    }

}
