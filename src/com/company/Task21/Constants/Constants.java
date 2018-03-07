package com.company.Task21.Constants;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String START_POINT = "Enter command";
    public static final String IN_PATIENT_LIST_WITH_DIAGNOSE = "Enter -getList @diagnose to get list of patients with specific diagnose";
    public static final String IN_RANGE_CARD_ID = "Enter -range @param-@param where @param is letter from alphabet to get list of patience in that area";
    public static final String IN_ORDER_IN_ALPHABET = "Enter -sort to sort in alphabet order";

    public static final String ERR_INCORRECT_COMMAND = "Error. Incorrect command";

    public static final String[] commands = {"-getList", "-range", "-sort"};
    public static final String[] diagnoses = {"diagnose1", "diagnose2", "diagnose3"};
}
