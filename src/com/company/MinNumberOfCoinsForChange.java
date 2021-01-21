package com.company;

public class MinNumberOfCoinsForChange {
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int denomsPointer = denoms.length-1;
        int counter = 0;
        while (n != 0){
            if (n >= denoms[denomsPointer]){
                counter++;
                n -= denoms[denomsPointer];
            }else {
                denomsPointer--;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] array = {1,5,10};
        int n = 7;
        minNumberOfCoinsForChange(n, array);
    }
}
