import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 07.02.2018.
 */
public class ArrMinMaxRotateClassTest
{
    Logger log;

    public ArrMinMaxRotateClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrMinMaxRotate() throws Exception
    {
        ArrMinMaxRotateClass arrMinMaxRotateCall = new ArrMinMaxRotateClass();
        log.trace("Positive scenario, method returns array with rotated first and last elements.");
        int [] arr91 = {3000, -1000, 25, 30, 35, 400, 45, 100, -8000};
        int [] mas91 = arrMinMaxRotateCall.arrMinMaxRotate(arr91);
        int [] ans91 = {-8000, -1000, 25, 30, 35, 400, 45, 100, 3000};
        Assert.assertArrayEquals(ans91, mas91);

        log.trace("Positive scenario, method returns array with one element on same position.");
        int [] arr92 = {100};
        int [] mas92 = arrMinMaxRotateCall.arrMinMaxRotate(arr92);
        int [] ans92 = {100};
        Assert.assertArrayEquals(ans92, mas92);

        log.trace("Negative scenario, method returns -1");
        int [] arr93 = {};
        int [] mas93 = arrMinMaxRotateCall.arrMinMaxRotate(arr93);
        int [] ans93 = {-1};
        Assert.assertArrayEquals(ans93, mas93);
    }

}