package com.company.Task12;

public class Runner {
    void run(int num) {

        if (num < 1) {
            System.out.println("Incorrect input data");
            return;
        }
        numberSearch(num);

    }
    // TODO: 28-Feb-18 Connect those 2 moments to 1

    void numberSearch(int num) {
        int[] perfectNum = new int[5];
        int k = 0;

        int[] dividers;



        for (int i = 0; i < num; i++) {
            dividers = getDividers(i, num);
            if(isNumberPerfect(dividers, i)){
                perfectNum[k] = i;
                k++;
            }
        }
        printPerfectNum(perfectNum, num);

    }

    int[] getDividers(int num, int arrSize) {
        int[] dividersArr = new int[arrSize];
        dividersArr[0] = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                dividersArr[i] = i;
            }
        }
        return dividersArr;
    }

    boolean isNumberPerfect(int[] dividerArr, int num) {
        int sum = 0;
        for (int i = 0; i < dividerArr.length; i++) {
            sum += dividerArr[i];
        }
        return num == sum;
    }
    void printPerfectNum(int[] perfectNum, int num){
        System.out.println("the list of perfect numbers which are smaller than "+num+" is:");
        for (int i = 1; i < perfectNum.length; i++) {
            if (perfectNum[i]!=0)
                System.out.println(perfectNum[i]);
        }
    }
}

