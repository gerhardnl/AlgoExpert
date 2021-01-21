package com.company;

public class SingleCycleCheck {
    public static boolean hasSingleCycle(int[] array) {

        for (int pointer = 0; pointer < array.length; pointer++) {
            boolean[] checker = new boolean[array.length];

            for (int i = 0; i < array.length ; i++) {
                if (checker[pointer] == true) return false;

                checker[pointer] = true;

                pointer = (array[pointer] + pointer) % array.length;

                if(pointer < 0) pointer += array.length;

            }
        }

        return true;

    }
    public static void main(String[] args) {
        int[] array = {2,3,1,-4,-4,2};
        hasSingleCycle(array);
    }
}
