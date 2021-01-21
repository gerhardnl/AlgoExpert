package com.company;

public class KadanesAlgorithm {
    public static int kadanesAlgorithm(int[] array) {
        int max = array[0];
        int tempMax = array[0];
        for (int i = 1; i <array.length ; i++) {
            if (array[i] > tempMax + array[i]){
                tempMax = array[i];
            }else {
                tempMax += array[i];
            }
            max = Math.max(max, tempMax);
        }
        return max;
    }
}
