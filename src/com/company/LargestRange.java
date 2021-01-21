package com.company;

import java.util.Arrays;

public class LargestRange {
    public static int[] largestRange(int[] array) {
        if(array.length > 1) return new int[] {array[0], array[0]};
        Arrays.sort(array);
        int firstPointer = 0;
        int secondPointer = 0;
        int range = 0;
        int[] result = new int[2];

        for (int i = 0; i <array.length -1 ; i++) {
            if(array[i + 1] - array[i] == 1){
                for (int j = i + 1; j < array.length; j++) {
                    firstPointer = array[i];
                    if(array[j] != array[j - 1]) {
                        if (array[j] - array[j - 1] == 1) {
                            secondPointer = array[j];
                            if (range <= secondPointer - firstPointer) {
                                result[0] = firstPointer;
                                result[1] = secondPointer;
                                range = secondPointer - firstPointer;
                            }
                        } else {
                            i = j - 1;
                            break;
                        }
                    }
                }

            }
        }

        return result;
    }

}
