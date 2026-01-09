package br.com.sudoku.domain.validation;

public class ValidateSudokuRules {

    public boolean isTheNumberInRow(int[][] board, int number, int row) {

        for (int columnPos = 0; columnPos < board.length; columnPos++) {
            if (board[row][columnPos] == number) {
                return false;
            }
        }

        return true;
    }

    public boolean isTheNumberInColumn(int[][] board, int number, int column) {

        for (int rowPos = 0; rowPos < board.length; rowPos++) {
            if (board[rowPos][column] == number) {
                return false;
            }
        }

        return true;
    }

    public boolean isTheNumberInA3x3Block(int[][] board, int number, int row, int column) {

        int currentRow = row - row % 3;
        int currentColumn = column - column % 3;

        for (int row3x3 = currentRow; row3x3 < currentRow + 3; row3x3++) {
            for (int column3x3 = currentColumn; column3x3 < currentColumn + 3; column3x3++) {

                if (board[row3x3][column3x3] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isAValidPlaceForTheNumber(int[][] board, int row, int column, int number) {

        return isTheNumberInRow(board, number, row) && isTheNumberInColumn(board, number, column)
                && isTheNumberInA3x3Block(board, number, row, column);


    }
}
