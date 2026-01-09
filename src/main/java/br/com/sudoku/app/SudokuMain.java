package br.com.sudoku.app;

import br.com.sudoku.solver.SolveSudoku;
import br.com.sudoku.domain.model.Sudoku;

public class SudokuMain {

    public static void main(String[] args) {

        int[][] board = new int[9][9];

        Sudoku sudoku = new Sudoku();
        SolveSudoku solvedSudoku = new SolveSudoku(sudoku);

        solvedSudoku.printSolvedSudokuBoard(board);


    }


}



