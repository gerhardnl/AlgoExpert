package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveElemtToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int temp = 0;
        int counter = array.size() - 1;

        for (int i = 0; i <array.size() ; i++) {
            if(array.get(i).equals(toMove)){
                while (array.get(counter).equals(toMove)) {
                    counter--;
                    if (counter <= i)  return array;
                }
                if (counter <= i)  return array;
                temp = array.get(counter);
                array.set(counter, array.get(i));
                array.set(i, temp);
                counter--;

            }
        }
        return array;
    }

}
