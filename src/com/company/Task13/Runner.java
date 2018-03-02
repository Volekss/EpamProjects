package com.company.Task13;

public class Runner {
    void run(int n){
        int noOfRows = n;
        int rowCount = 1;

        for (int i = noOfRows; i >= 1; i--) {
            //Printing i*2 spaces at the beginning of each row
            for (int j = 1; j <= i*2; j++) {
                System.out.print(" ");
            }
            //Printing j where j value will be from i to noOfRows
            for (int j = i; j <= noOfRows; j++) {
                System.out.print(j+" ");
            }
            //Printing j where j value will be from noOfRows-1 to i
            for (int j = noOfRows-1; j >= i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
    }
}
