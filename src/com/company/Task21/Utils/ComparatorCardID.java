package com.company.Task21.Utils;

import com.company.Task21.Model.Patient;

import java.util.Comparator;

public class ComparatorCardID implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int cardID1 = ((Patient) o1).getCardID();
        int cardID2 = ((Patient) o2).getCardID();
        return cardID2 - cardID1;
    }
}
