package com.company;

public class SubarraySort {
    public static int[] subarraySort(int[] array) {
        if (isSorted(array)){
            return new int[] {-1, -1};
        }
        int[] result = new int[2];
        result[1] = findRightSortingIndex(array);
        result[0] = findLeftSortingIndex(array);
        return result;
    }
    public static int findRightSortingIndex(int[] array){
        int value = Integer.MIN_VALUE;
        int sortingIndex = 0;
        for (int i = 0; i <array.length ; i++) {
            if (value < array[i]){
                value = array[i];
            }else {
                sortingIndex = i;
            }
        }
        return sortingIndex;
    }
    public static int findLeftSortingIndex(int[] array){
        int value = Integer.MAX_VALUE;
        int sortingIndex = array.length-1;
        for (int i = array.length - 1; i >= 0 ; i--) {
            if (value >= array[i]){
                value = array[i];
            }else {
                sortingIndex = i;
            }
        }
        return sortingIndex;
    }
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
