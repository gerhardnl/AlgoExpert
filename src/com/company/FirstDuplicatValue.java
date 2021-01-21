package com.company;

public class FirstDuplicatValue {
    public static int firstDuplicateValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int absValue = Math.abs(array[i]);
            if (array[Math.abs(absValue-1)] < 0){
                return absValue;
            }
            array[absValue-1] *= -1;
        }
        return -1;
    }

}
