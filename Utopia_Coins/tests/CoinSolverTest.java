import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoinSolverTest {

    CoinSolver coinSolver;

    @BeforeEach
    void setUp() {
        coinSolver = new CoinSolver();
    }

    @Test
    void minCoinsZero() {
        Assertions.assertEquals(0, coinSolver.minCoins(0));
    }
    @Test
    void minCoinsInBounds() {
        Assertions.assertEquals(2, coinSolver.minCoins(23));
    }
    @Test
    void minCoinsHigh() {
        Assertions.assertEquals(6, coinSolver.minCoins(99));
    }
}