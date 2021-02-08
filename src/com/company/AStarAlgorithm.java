package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AStarAlgorithm {
    public static  List<List<Integer>> aStarAlgorithm(int startRow, int startCol, int endRow, int endCol, int[][] graph) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(Collections.nCopies(20,new ArrayList<>()));
        List<List<Integer>> temp = new ArrayList<List<Integer>>();
        boolean[][] used = new boolean[graph.length][graph[0].length];
        int pointer = 0;
        BFS(startRow, startCol, endRow, endCol, graph, result, temp, pointer, used);
        return result;
    }

    private static List<List<Integer>> BFS(int startRow, int startCol, int endRow, int endCol, int[][] graph, List<List<Integer>> result, List<List<Integer>> temp, int pointer, boolean[][] used) {


        if (startCol == endCol && startRow == endRow && temp.size() < result.size()){
            result.clear();
            result.addAll(temp);
            List<Integer> toAdd = new ArrayList<>();
            toAdd.add(startRow);
            toAdd.add(startCol);
            result.add(toAdd);
        }
        if (startRow >= 0 && startRow < graph.length && startCol >= 0 && startCol < graph[0].length){
            if (graph[startRow][startCol] != 1 && used[startRow][startCol] != true) {
                used[startRow][startCol] = true;
                List<Integer> toAdd = new ArrayList<>();
                toAdd.add(startRow);
                toAdd.add(startCol);
                temp.add(toAdd);
                System.out.println(temp);
                BFS(startRow + 1, startCol, endRow, endCol, graph, result, temp, pointer+1, used);
                BFS(startRow - 1, startCol, endRow, endCol, graph, result, temp, pointer+1, used);
                BFS(startRow, startCol + 1, endRow, endCol, graph, result, temp, pointer+1, used);
                BFS(startRow, startCol - 1, endRow, endCol, graph, result, temp, pointer+1, used);
                temp.remove(pointer);
                pointer--;
             //   used[startRow][startCol] = false;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] array = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
        };

        int startRow = 0;
        int startCol = 1;
        int endRow = 4;
        int endCol = 3;
        System.out.println(aStarAlgorithm(startRow, startCol, endRow, endCol, array));
    }
}
