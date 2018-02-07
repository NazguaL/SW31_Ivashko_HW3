import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 07.02.2018.
 */
public class ArrRevert2ClassTest
{
    Logger log;

    public ArrRevert2ClassTest  ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrRevert2() throws Exception
    {
        ArrRevert2Class arrRevert2Call = new ArrRevert2Class();
        log.trace("Positive scenario, array with uneven elements count.");
        int [] arr121 = {1, 3, 2, 5, 3, 4, 7};
        int [] mas121 = arrRevert2Call.arrRevert2(arr121);
        int [] ans121 = {3, 1, 5, 2, 4, 3, 7};
        Assert.assertArrayEquals(ans121, mas121);

        log.trace("Positive scenario, array with even elements count.");
        int [] arr122 = {1, 3, 2, 5, 3, 4, 7, 8};
        int [] mas122 = arrRevert2Call.arrRevert2(arr122);
        int [] ans122 = {3, 1, 5, 2, 4, 3, 8, 7};
        Assert.assertArrayEquals(ans122, mas122);

        log.trace("Positive scenario, array with no elements");
        int [] arr123 = {};
        int [] mas123 = arrRevert2Call.arrRevert2(arr123);
        int [] ans123 = {};
        Assert.assertArrayEquals(ans123, mas123);
    }

}