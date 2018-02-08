import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrABSMaxToZeroClassTest
{
    Logger log;

    public ArrABSMaxToZeroClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }
    @Test
    public void arrABSMaxToZero() throws Exception
    {
        ArrABSMaxToZeroClass arrABSMaxToZeroCall = new  ArrABSMaxToZeroClass();

        log.trace("Positive scenario, method returns array with changed first and last elements.");
        int [] arr161 = {-8000, 1000, 25, 30, 35, 400, 45, 100, 3000, 7, -10000};
        int [] mas161 = arrABSMaxToZeroCall.arrABSMaxToZero(arr161);
        int [] ans161 = {0, 1000, 25, 30, 35, 400, 45, 100, 3000, 7, 0};
        Assert.assertArrayEquals(ans161, mas161);

        log.trace("Positive scenario, method returns with no changed element.");
        int [] arr162 = {1};
        int [] mas162 = arrABSMaxToZeroCall.arrABSMaxToZero(arr162);
        int [] ans162 = {1};
        Assert.assertArrayEquals(ans162, mas162);

        log.trace("Negative scenario, method returns -1.");
        int [] arr163 = {};
        int [] mas163 = arrABSMaxToZeroCall.arrABSMaxToZero(arr163);
        int [] ans163 = {-1};
        Assert.assertArrayEquals(ans163, mas163);

    }

}