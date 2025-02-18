package com.c0dethink;

import java.util.Arrays;

public class twpDimensionalArrays {
    public static void main(String[] args) {
//        create an 2dArray
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
//          create a 2dArray in another way.
        char[][] board2 = new char[][] {
            new char[] {'0', '-', '-'},
            new char[] {'0', '-', '-'},
            new char[] {'0', '-', '-'},
        };

        board[0][0] = 'o';
        board[1][0] = 'o';
        board[2][0] = 'o';
//        note: deepToString
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(board2));
    }
}
