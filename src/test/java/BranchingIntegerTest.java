import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BranchingIntegerTest {

    @Test
    public void test_max() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        final int result = branchingInteger.max(23, 42);
        assertEquals(42, result);
    }

    @Test
    public void test_defCoveredNoPairs() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        final int result = branchingInteger.defCoveredNoPairs(1, 6);
        assertEquals(6, result);
    }

    @Test
    public void test_increaseField() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        branchingInteger.increaseField();
        assertEquals(1, branchingInteger.field);
    }

    @Test
    public void test_foo() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        int result = branchingInteger.foo(4);
        assertEquals(4, result);
    }

    @Test
    public void test_callFoo() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        final int result = branchingInteger.callFoo(1);
        assertEquals(2, result);
    }

    @Test
    public void test_getField() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        int result = branchingInteger.getField();
        assertEquals(0, result);
    }

    @Test
    public void test_setField(){
        final BranchingInteger branchingInteger = new BranchingInteger();
        branchingInteger.setField(1);
        assertEquals(1, branchingInteger.field);
    }

    @Test
    public void test_modifyPar() {
        final BranchingInteger branchingInteger1 = new BranchingInteger();
        final BranchingInteger branchingInteger2 = new BranchingInteger();

        branchingInteger1.modifyPar(branchingInteger2);
        assertEquals(1, branchingInteger2.field);
    }

    @Test
    public void test_loop() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        final int result = branchingInteger.loop();
        assertEquals(3, result);
    }

    @Test
    public void test_add() {
        final BranchingInteger branchingInteger = new BranchingInteger();
        final int result = branchingInteger.add(0);
        assertEquals(1, result);
    }
}
