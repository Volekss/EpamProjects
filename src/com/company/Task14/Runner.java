package com.company.Task14;

public class Runner {

    void run (int n){
        printMatrix(rotateMatrix(generateAndOutputMatrix(n)));
    }

    int[][] rotateMatrix(int[][] enterMatrix) {

        int[][] returnMatrix = new int[enterMatrix.length][enterMatrix.length];
        for (int i = 0; i < enterMatrix.length; i++) {
            for (int j = 0; j < enterMatrix.length; j++) {
                returnMatrix[i][j] = enterMatrix[j][enterMatrix.length - i - 1];
            }
        }

        return returnMatrix;
    }

    void printMatrix(int[][] inputMatrix){
        System.out.println("");
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                System.out.print(inputMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    int[][] generateAndOutputMatrix(int n){
        int[][] outputMatrix = new int[n][n];
        int counter = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                //counter++;
                outputMatrix[i][j] =n*i + j ;

            }
        }
        printMatrix(outputMatrix);
        return outputMatrix;

    }

}
