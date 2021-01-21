package com.company;

import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayPointer = 0;
        int sequencePointer = 0;
        while (arrayPointer < array.size()){
            if (array.get(arrayPointer) == sequence.get(sequencePointer)){
                sequencePointer++;
                arrayPointer++;
            }else {
                arrayPointer++;
            }
            if (sequencePointer == sequence.size()){
                return true;
            }
        }
        return false;
    }
}
