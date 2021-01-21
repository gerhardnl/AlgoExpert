package com.company;

public class LevenshteinDistance {
    public static int levenshteinDistance(String str1, String str2) {
        int[][] array = new int[str2.length()+1][str1.length()+1];

        int numberOfActions = 0;

        for (int i = 0; i <str2.length() +1 ; i++) {
            array[i][0] = i;
        }
        for (int i = 0; i <str1.length() +1 ; i++) {
            array[0][i] = i;
        }

        for (int i = 1; i <str2.length() + 1 ; i++) {
            for (int j = 1; j <str1.length() + 1 ; j++) {
                if (str2.charAt(i-1) == str1.charAt(j-1)){
                    array[i][j] = array[i-1][j-1];
                } else {
                    array[i][j] = Math.min(array[i-1][j-1], Math.min(array[i][j-1], array[i-1][j])) +1;
                }
            }
        }
        numberOfActions = array[str2.length()][str1.length()];
        return numberOfActions;
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "yabd";

        System.out.println(levenshteinDistance(str1,str2));
    }
}
