import org.junit.Test;
import org.junit.*;

public class SolutionTest {

    @Test
    public void closestToZero() {
        double[] ts =
                {7, -10, 13, 8, 4, -7.2, -12, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7};
        double result = Solution.closestToZero(ts);
        Assert.assertEquals(-1.7, result, 0.0);
    }
}