package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BoggleBoard {
    public static boolean isCorrect = false;
    public static List<String> boggleBoard(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                for (int k = 0; k <board[j].length ; k++) {
                    if (words[i].charAt(0) == board[j][k]){
                        boolean[][] usedLetters = new boolean[board.length][board[0].length];
                        String toAdd = BFS(words[i], board, usedLetters, j, k, 0, "");
                        if(toAdd != null){
                            result.add(toAdd);
                        }

                    }
                    if (isCorrect) break;
                }
                if(isCorrect) break;
            }
            isCorrect = false;
        }
        return result;
    }

    private static String BFS(String word, char[][] board, boolean[][] usedLetters, int j, int k, int pointer, String lookingFor) {



        if(j >= 0 && k >= 0 && j < board.length && k < board[0].length && usedLetters[j][k] == false && pointer < word.length()){
            if (board[j][k] == word.charAt(pointer)){

                usedLetters[j][k] = true;
                lookingFor += String.valueOf(board[j][k]);
                pointer++;
                BFS(word, board, usedLetters, j+1, k, pointer, lookingFor);
                BFS(word, board, usedLetters, j, k+1, pointer, lookingFor);
                BFS(word, board, usedLetters, j-1, k, pointer, lookingFor);
                BFS(word, board, usedLetters, j, k-1, pointer, lookingFor);
                BFS(word, board, usedLetters, j-1, k-1, pointer, lookingFor);
                BFS(word, board, usedLetters, j-1, k+1, pointer, lookingFor);
                BFS(word, board, usedLetters, j+1, k+1, pointer, lookingFor);
                BFS(word, board, usedLetters, j+1, k-1, pointer, lookingFor);
                usedLetters[j][k] = false;
            }

        }
        if (word.equals(lookingFor)) isCorrect = true;
        if (isCorrect) return word;
        else return null;
    }
    public static void main(String[] args) {
        char[][] array = {
                {'t', 'h', 'i', 's', 'i', 's', 'a'},
                {'s', 'i', 'm', 'p', 'l', 'e', 'x'},
                {'b', 'x', 'x', 'x', 'x', 'e', 'b'},
                {'x', 'o', 'g', 'g', 'l', 'x', 'o'},
                {'x', 'x', 'x', 'D', 'T', 'r', 'a'},
                {'R', 'E', 'P', 'E', 'A', 'd', 'x'},
                {'x', 'x', 'x', 'x', 'x', 'x', 'x'},
                {'N', 'O', 'T', 'R', 'E', '-', 'P'},
                {'x', 'x', 'D', 'E', 'T', 'A', 'E'}
        };
        String[] words = {  "this",
                "is",
                "not",
                "a",
                "simple",
                "boggle",
                "board",
                "test",
                "REPEATED",
                "NOTRE-PEATED"};
        boggleBoard(array, words);


    }
}
