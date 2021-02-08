package com.company;

public class MinNumberOfJUmps {
    public static int minNumberOfJumps(int[] array) {
        int jumps = 0;
        int temp = 0;

        for (int i = 0; i < array.length ; i++) {
            i = temp;
            int tracker = 0;
            int pointer = 0;
            int temp2 = 0;
            if (i == array.length-1) return jumps;
            jumps++;
            for (int j = i+1; j <= array[i]+i ; j++) {
                if (j == array.length-1) return jumps;

                if(array[j]+pointer > temp2 + tracker){
                    tracker = array[j];
                    temp = j;
                    pointer = temp2;
                }
                pointer++;

            }



        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {3, 12, 2, 1, 2, 3, 7, 1, 1, 1, 3, 2, 3, 2, 1, 1, 1, 1};
        System.out.println(minNumberOfJumps(array));
    }
}
