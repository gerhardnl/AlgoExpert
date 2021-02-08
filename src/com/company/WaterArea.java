package com.company;

public class WaterArea {
    public static int waterArea(int[] heights) {
        int rightHeight = 0;
        int leftHeight = 0;
        int middle = 0;
        int rightIndex = 0;
        int leftIndex = 0;
        int water = 0;
        int tempWater = 0;

        for (int i = 0; i < heights.length ; i++) {
            if(heights[i] >= leftHeight){
                if (leftHeight < rightHeight){
                    middle+= leftHeight;
                }
                leftHeight = heights[i];
                leftIndex = i;
                tempWater = Math.min(leftHeight, rightHeight) * (leftIndex - rightIndex -1);
            }else if(leftHeight >= rightHeight){
                rightHeight = leftHeight;
                rightIndex = leftIndex;
                leftHeight = heights[i];
                leftIndex = i;
                water += tempWater;
                tempWater = 0;
            }else {
                middle += heights[i];
            }
        }
        water += tempWater;
        water -= middle;
        return water;
    }
    public static void main(String[] args) {
        int[] array = {0, 100, 0, 0, 10, 1, 1, 10, 1, 0, 1, 1, 0, 0};
        System.out.println(waterArea(array));
    }
}
