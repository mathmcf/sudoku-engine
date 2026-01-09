package br.com.sudoku.solver;

import br.com.sudoku.domain.model.Sudoku;
import br.com.sudoku.domain.validation.ValidateSudokuRules;

import java.util.Arrays;
import java.util.Random;

public class SolveSudoku {

    private final ValidateSudokuRules validator;

    public SolveSudoku(Sudoku sudoku) {
        this.validator = new ValidateSudokuRules();
    }

    public boolean solveSudoku(int[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {

                if (board[row][column] == 0) {

                    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

                    shuffleNumbersInBoard(numbers);

                    for (int number : numbers) {

                        if (this.validator.isAValidPlaceForTheNumber(board, row, column, number)) {
                            board[row][column] = number;

                            if (solveSudoku(board)) {
                                return true;
                            }

                            board[row][column] = 0;
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    private void shuffleNumbersInBoard(int[] array) {

        Random random = new Random();

        for (int i = array.length - 1; i > -1; i--) {
            int j = random.nextInt(i + 1);
            int currentNumber = array[i];
            array[i] = array[j];
            array[j] = currentNumber;
        }
    }

    public void printSolvedSudokuBoard(int[][] board) {

        solveSudoku(board);

        for (int[] rows : board) {
            System.out.println(Arrays.toString(rows));
        }

    }


}
