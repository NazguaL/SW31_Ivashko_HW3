import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrReplaceMax2ZeroClassTest
{
    Logger log;

    public ArrReplaceMax2ZeroClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrReplaceMax2Zero() throws Exception
    {
        ArrReplaceMax2ZeroClass arrReplaceMax2ZeroCall = new  ArrReplaceMax2ZeroClass();
        log.trace("Positive scenario, method returns array: 3000, 1000, 25, 30, 35, 400, 45, 100, 0, 7, 8000.");
        int [] arr181 = {3000, 1000, 25, 30, 35, 400, 45, 100, 8000, 7, 8000};
        int [] mas181 = arrReplaceMax2ZeroCall.arrReplaceMax2Zero(arr181);
        int [] ans181 = {3000, 1000, 25, 30, 35, 400, 45, 100, 0, 7, 8000};
        Assert.assertArrayEquals(ans181, mas181);

        log.trace("negative scenario, method returns -1");
        int [] arr182 = {};
        int [] mas182 = arrReplaceMax2ZeroCall.arrReplaceMax2Zero(arr182);
        int [] ans182 = {0-1};
        Assert.assertArrayEquals(ans182, mas182);

    }

}