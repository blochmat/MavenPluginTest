import static org.junit.Assert.assertEquals;

import asd.f.GCD;
import org.junit.Before;
import org.junit.Test;

public class GCDTest {

    private GCD gcd;

    @Before
    public void setUp() {
        gcd = new GCD();
    }

    @Test
    public void test_primes() {
        int result = gcd.gcd(17, 23);
        assertEquals(1, result);
    }
}