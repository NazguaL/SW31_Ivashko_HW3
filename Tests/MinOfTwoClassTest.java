import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class MinOfTwoClassTest
{
    Logger log;

    public MinOfTwoClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void minOfTwo() throws Exception {
        MinOfTwoClass MinOfTwoCall = new MinOfTwoClass();
        log.trace("Positive scenario, expected 5");
        Assert.assertEquals(5, MinOfTwoCall.minOfTwo(5, 10));
        log.trace("Positive scenario, expected not 10");
        Assert.assertNotEquals(10, MinOfTwoCall.minOfTwo(5, 10));
    }

}