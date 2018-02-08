import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrP1P2ClassTest
{
    Logger log;

    public ArrP1P2ClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrP1P2() throws Exception
    {
        ArrP1P2Class arrP1P2Call = new  ArrP1P2Class();

        log.trace("Positive scenario, method returns array: 0, 945000000, 840000.");
        int [] arr171 = {-30, 10, -25, 30, -35, 40, -45, 10, -80, 7, -10};
        long [] mas171 = arrP1P2Call.arrP1P2(arr171);
        long [] ans171 = {0, 945000000, 840000};
        Assert.assertArrayEquals(ans171, mas171);

    }

}