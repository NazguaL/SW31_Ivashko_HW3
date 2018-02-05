import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class MinOfTwoClassTest {
    @Test
    public void minOfTwo() throws Exception {
        MinOfTwoClass MinOfTwoCall = new MinOfTwoClass();
        Assert.assertEquals(5, MinOfTwoCall.minOfTwo(5, 10));
    }

}