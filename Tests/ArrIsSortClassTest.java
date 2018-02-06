import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 06.02.2018.
 */
public class ArrIsSortClassTest
{
    Logger log;

    public ArrIsSortClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }
    @Test
    public void arrIsSort() throws Exception
    {
        ArrIsSortClass arrIsSortCall = new ArrIsSortClass();

        int [] arr51 = {10, 20, 25, 30, 35, 40, 45, 100, 200};
        log.trace("Positive scenario, massive is sorted, method returns true");
        Assert.assertTrue(arrIsSortCall.arrIsSort(arr51));

        int [] arr52 = {};
        log.trace("Positive scenario, massive is empty, method returns true");
        Assert.assertTrue(arrIsSortCall.arrIsSort(arr52));

        int [] arr53 = {20, 200, 25, 30, 35, 40, 45, 100, 200};
        log.trace("Positive scenario, massive is empty, method returns false");
        Assert.assertFalse(arrIsSortCall.arrIsSort(arr53));

    }

}