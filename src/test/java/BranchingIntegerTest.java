import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BranchingIntegerTest {

    @Test
    public void test_max() {
        final BranchingInteger branchingInteger = new BranchingInteger(1, 2);
        final int result = branchingInteger.max(23, 42);
        assertEquals(42, result);
    }

    @Test
    public void test_add3() {
        final BranchingInteger branchingInteger = new BranchingInteger(1, 2);
        final int result = branchingInteger.add3(
                branchingInteger.x, branchingInteger.y, 3);
        assertEquals(6, result);
    }

    @Test
    public void test_addXYZ(){
        final BranchingInteger branchingInteger = new BranchingInteger(1,2 );
        final int result = branchingInteger.addXYZ();
        assertEquals(8, result);
    }
}
