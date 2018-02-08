import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrMinMaxClassTest
{
    Logger log;

    public ArrMinMaxClassTest()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrMinMax() throws Exception
    {
        ArrMinMaxClass arrMinMaxCall = new  ArrMinMaxClass();
        log.trace("Positive scenario, method returns: mаx(а[0], а[2], ..., а[2к]): 400 and min(а[1], а[3], …, а[2к-1]): -8000");
        int [] arr141 = {-100, 3000, -1000, 25, 30, 35, 400, 45, 100, -8000, 7, 10000};
        int [] mas141 = arrMinMaxCall.arrMinMax(arr141);
        int [] ans141 = {400, -8000};
        Assert.assertArrayEquals(ans141, mas141);

        log.trace("Positive scenario, array with one zero element, method returns: mаx(а[0], а[2], ..., а[2к]): 0 and min(а[1], а[3], …, а[2к-1]): 0");
        int [] arr142 = {0};
        int [] mas142 = arrMinMaxCall.arrMinMax(arr142);
        int [] ans142 = {0, 0};
        Assert.assertArrayEquals(ans142, mas142);

        log.trace("Negative scenario, array with no elements");
        int [] arr143 = {};
        int [] mas143 = arrMinMaxCall.arrMinMax(arr143);
        int [] ans143 = {-1};
        Assert.assertArrayEquals(ans143, mas143);

    }

}