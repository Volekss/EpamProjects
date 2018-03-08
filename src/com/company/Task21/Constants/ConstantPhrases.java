package com.company.Task21.Constants;

public interface ConstantPhrases {

    String START_POINT = "Enter command";
    String IN_PATIENT_LIST_WITH_DIAGNOSE = "Enter -getList @diagnose to get list of patients with specific diagnose";
    String IN_RANGE_CARD_ID = "Enter -range @param-@param where @param is letter from alphabet to get list of patience in that area";
    String IN_ORDER_IN_ALPHABET = "Enter -sort to sort in alphabet order";

    String ERR_INCORRECT_COMMAND = "Error. Incorrect command or param";
    String ERR_NO_PATIENTS_FOUND_WITH_DIAGNOSE = "Error. No patients found with such diagnose: ";
    String ERR_NO_PATIENTS_FOUND_IN_THE_RANGE = "Error. No patients found int this range: ";
    String ERR_END_RANGE_LOWER_THAN_START_RANGE = "Error. End range cannot be lower than start range";
    String[] commands = {"-getList", "-range", "-sort"};
    String[] diagnoses = {"diagnose1", "diagnose2", "diagnose3"};
}
