import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenMoreBranchingIntegerTest {

    @Test
    public void test_areEqual(){
        EvenMoreBranchingInteger evenMoreBranchingInteger = new EvenMoreBranchingInteger();
        boolean result = evenMoreBranchingInteger.areEqual(2,2);
        assertTrue(result);
    }
}
