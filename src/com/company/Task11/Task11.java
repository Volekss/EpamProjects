package com.company.Task11;

public class Task11 {


    public static void main(String[] args) {
        toBinary(32);
        toOct(32);
        toHex(32);
    }

    static void toBinary(int num) {
        int startNum = num;
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        printBinaryResult(binary, index, startNum);
    }

    static void printBinaryResult(int[] binary, int index, int num) {
        System.out.print("Binary of " + num + " is ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    static void toOct(int num) {
        int startNum = num;
        int oct[] = new int[20];
        int index = 0;
        while (num > 0) {
            oct[index++] = num % 8;
            num = num / 8;
        }
        printOctResult(oct, index, startNum);
    }

    static void printOctResult(int[] oct, int index, int num) {
        System.out.print("Oct of " + num + " is ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(oct[i]);
        }
        System.out.println();
    }


    static void toHex(int num) {
        int startNum = num;
        String hex[] = new String[200];
        int index = 0;
        String temp;

        while (num > 0) {
            int buff = num % 16;


            switch (num % 16) {
                case 10:
                    temp = "A";
                    break;
                case 11:
                    temp = "B";
                    break;
                case 12:
                    temp = "C";
                    break;
                case 13:
                    temp = "D";
                    break;
                case 14:
                    temp = "E";
                    break;
                case 15:
                    temp = "F";
                    break;
                default:
                    temp = String.valueOf(buff);
            }
            temp = String.valueOf(buff);

            hex[index++] = temp;
            num = num / 16;
        }
        printHexResult(hex, index, startNum);

    }

    static void printHexResult(String[] hex, int index, int num) {
        System.out.print("Hex of " + num + " is ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hex[i]);
        }
        System.out.println();
    }

}
