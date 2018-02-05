import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class ArrWithZeroClassTest
{
    Logger log;

    public ArrWithZeroClassTest()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrWithZero() throws Exception
    {
        log.trace("Positive scenario, 2 \"zero\" elements in the array.");
        ArrWithZeroClass arrWithZeroCall = new ArrWithZeroClass();
        int [] arr31 = {20, 0, 15, 30, 30, 40, 30, 0};
        int [] res31 = {1, 7};
        Assert.assertArrayEquals(res31, arrWithZeroCall.arrWithZero(arr31));
        log.trace("Positive scenario, no \"zero\" elements in the array.");
        int [] arr32 = {20, 30, 15, 30, 30, 40, 30, 30};
        int [] res32 = {};
        Assert.assertArrayEquals(res32, arrWithZeroCall.arrWithZero(arr32));
    }

}