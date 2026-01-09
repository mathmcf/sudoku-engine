package br.com.sudoku;

import br.com.sudoku.solver.SolveSudoku;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SolveSudokuTest {

    @InjectMocks
    private SolveSudoku sudoku;

    @Test
    void solve_OnceValidatedRowsAndColumnsAnd3X3Block_SolveSudoku() {

        int[][] board = {
                {9, 1, 7, 6, 8, 4, 3, 2, 5},
                {2, 4, 3, 7, 9, 5, 1, 6, 8},
                {8, 5, 6, 3, 1, 2, 9, 4, 7},
                {4, 9, 1, 8, 2, 3, 5, 7, 6},
                {5, 3, 2, 4, 6, 7, 8, 9, 1},
                {6, 7, 8, 1, 5, 9, 4, 3, 2},
                {7, 6, 4, 5, 3, 8, 2, 1, 9},
                {1, 2, 5, 9, 4, 6, 7, 8, 3},
                {3, 8, 9, 2, 7, 1, 6, 5, 4}
        };

        boolean expectedResult = true;
        boolean result = sudoku.solveSudoku(board);

        Assertions.assertEquals(expectedResult, result);
    }

}
