package com.company;

public class ArrayOfProducts {
    public static int[] arrayOfProducts(int[] array) {

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int toAdd = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    toAdd *= array[j];
                }

            }
            result[i] = toAdd;
        }
        return result;
    }
}
