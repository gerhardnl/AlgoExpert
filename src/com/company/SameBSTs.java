package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SameBSTs {
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        if (arrayOne.size() == 0 && arrayTwo.size() == 0) return true;
        if (arrayOne.size() != arrayTwo.size()) return false;
        if (arrayOne.get(0).intValue() != arrayTwo.get(0).intValue()) return false;

        List arrauOneSmaller = new ArrayList();
        List arrauOneBigger = new ArrayList();
        List arrauTwoSmaller = new ArrayList();
        List arrauTwoBigger = new ArrayList();

        for (int i = 1; i < arrayOne.size() ; i++) {
            if (arrayOne.get(i) >= arrayOne.get(0)) arrauOneBigger.add(arrayOne.get(i));

            else arrauOneSmaller.add(arrayOne.get(i));

            if (arrayTwo.get(i) >= arrayTwo.get(0)) arrauTwoBigger.add(arrayTwo.get(i));

            else arrauTwoSmaller.add(arrayTwo.get(i));
        }

        return sameBsts(arrauOneSmaller, arrauTwoSmaller) && sameBsts(arrauOneBigger, arrauTwoBigger);
    }
}
