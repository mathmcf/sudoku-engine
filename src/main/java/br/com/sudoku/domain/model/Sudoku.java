package br.com.sudoku.domain.model;

public class Sudoku {

    private final int[][] board = new int[9][9];

    public int[][] getBoard() {
        return board;
    }
}
