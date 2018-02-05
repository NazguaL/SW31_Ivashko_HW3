import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class ArrPosNegClassTest
{
    Logger log;

    public ArrPosNegClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }


    @Test
    public void arrPosNeg() throws Exception
    {
        log.trace("Positive scenario, first element is positive, method returns 1");
        int [] arr41 = {0, 0, 15, 30, 30, 40, 30, 0};
        ArrPosNegClass arrPosNegCall = new ArrPosNegClass();
        int res41 = arrPosNegCall.arrPosNeg(arr41);
        Assert.assertEquals(1, res41);

        log.trace("Positive scenario, first element is negative, method returns -1");
        int [] arr42 = {0, 0, -15, 30, 30, 40, 30, 0};
        int res42 = arrPosNegCall.arrPosNeg(arr42);
        Assert.assertEquals(-1, res42);

        log.trace("Positive scenario, no elements, method returns 0");
        int [] arr43 = {};
        int res43 = arrPosNegCall.arrPosNeg(arr43);
        Assert.assertEquals(0, res43);

        log.trace("Positive scenario, there are only \"zero\" elements in the array, method returns 0");
        int [] arr44 = {0, 0, 0};
        int res44 = arrPosNegCall.arrPosNeg(arr44);
        Assert.assertEquals(0, res44);

    }

}