package com.company;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {
    public static List<Character> longestCommonSubsequence(String str1, String str2) {
        String[][] array = new String[str1.length()+1][str2.length()+1];

        List<Character> result = new ArrayList<>();

        for (int i = 0; i <str1.length()+1 ; i++) {
            array[i][0] = "";
        }
        for (int i = 0; i <str2.length()+1 ; i++) {
            array[0][i] = "";
        }

        for (int i = 1; i <str1.length()+1 ; i++) {

            for (int j = 1; j <str2.length()+1 ; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    array[i][j] = str1.charAt(i-1) + array[i-1][j-1];
                }else {
                    if (array[i][j-1].length() >= array[i-1][j].length()){
                        array[i][j] = array[i][j-1];
                    }else {
                        array[i][j] = array[i-1][j];
                    }
                }
            }
        }
        for (char c : array[array.length-1][array[0].length-1].toCharArray()) {
            result.add(0,c);
        }

        return result;
    }
    public static void main(String[] args) {
        String str1 = "ZXVVYZW";
        String str2 = "XKYKZPW";

        longestCommonSubsequence(str1,str2);
    }
}
