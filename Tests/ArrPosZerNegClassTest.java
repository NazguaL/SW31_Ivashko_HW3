import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 07.02.2018.
 */
public class ArrPosZerNegClassTest {
    Logger log;

    public ArrPosZerNegClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrPosZerNeg() throws Exception
    {
        ArrPosZerNegClass arrPosZerNegCall = new ArrPosZerNegClass();
        log.trace("Positive scenario, method returns array with 1 negative, 1 \"zero\" and 7 positive elements.");
        int [] arr81 = {-10, 0, 25, 30, 35, 40, 45, 100, 200};
        int [] mas81 = arrPosZerNegCall.arrPosZerNeg(arr81);
        int [] ans81 = {1, 1, 7};
        Assert.assertArrayEquals(ans81, mas81);
        log.trace("Positive scenario, method returns array with 0 negative, 0 \"zero\" and 0 positive elements.");
        int [] arr82 = {};
        int [] mas82 = arrPosZerNegCall.arrPosZerNeg(arr82);
        int [] ans82 = {0, 0, 0};
        Assert.assertArrayEquals(ans82, mas82);
    }

}