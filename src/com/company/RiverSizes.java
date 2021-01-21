package com.company;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {
public static int size =0;
    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] == 1){
                    result.add(BFS(matrix, i, j));
                    size = 0;
                }
            }
        }


        return result;
    }

    private static int BFS(int[][] matrix, int i, int j) {


        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[i].length && matrix[i][j] == 1){
            size++;


            BFS(matrix, i + 1, j);
            BFS(matrix, i - 1, j);
            BFS(matrix, i, j - 1);
            BFS(matrix, i, j + 1);


        }

        return size;
    }
    public static void main(String[] args) {
        int[][] array = {{1,0,0,1,0},{1,0,1,0,0},{0,0,1,0,1},{1,0,1,0,1},{1,0,1,1,0}};
        riverSizes(array);
    }

}
