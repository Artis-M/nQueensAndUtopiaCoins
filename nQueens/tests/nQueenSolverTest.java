import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nQueenSolverTest {

    int correctBoard[][] = {{0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 1, 0, 0}};
    nQueenSolver queenSolver;

    @BeforeEach
    void setup() {
        queenSolver = new nQueenSolver();
    }

    @Test
    void solveQueen() {
        Assertions.assertArrayEquals(correctBoard, queenSolver.solveQueen());
    }

}