package com.company;

import java.util.ArrayList;
import java.util.List;

public class RightSmallerThan {
    public static List<Integer> rightSmallerThan(List<Integer> array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size() ; i++) {
            int counter = 0;
            for (int j = 1 + i; j <array.size(); j++) {
                if (array.get(i) > array.get(j)) counter++;
            }
            list.add(counter);
        }
        return list;
    }
}
