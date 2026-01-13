package br.com.sudoku.app;

import br.com.sudoku.solver.SolveSudoku;
import br.com.sudoku.domain.model.Sudoku;

public class SudokuMain {

    public static void main(String[] args) {

        Sudoku sudoku = new Sudoku();
        SolveSudoku solvedSudoku = new SolveSudoku(sudoku);

        solvedSudoku.printSolvedSudokuBoard(sudoku.getBoard());


    }


}



