import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BranchIntegerTest {

    @Test
    public void test_max() {
        final BranchInteger branchingInteger = new BranchInteger();
        final int result = branchingInteger.max(23, 42);
        assertEquals(42, result);
    }
}
