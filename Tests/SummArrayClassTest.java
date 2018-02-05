import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class SummArrayClassTest
{
    Logger log;

    public SummArrayClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void summArray() throws Exception
    {
        log.trace("K = 7, answer is 77.");
        SummArrayClass summArrayCall = new SummArrayClass();
        int [] arr2 = {27, 15, 37, 33, 42, 35};
        int k = 7;
        Assert.assertEquals(77, summArrayCall.summArray(arr2, k));

    }

}