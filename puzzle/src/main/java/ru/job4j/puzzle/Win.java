package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkGorizontal(board, i) || checkVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    static boolean checkVertical(int[][] board, int a) {
        boolean result = true;
        for (int[] ints : board) {
            if (ints[a] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    static boolean checkGorizontal(int[][] board, int a) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[a][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
