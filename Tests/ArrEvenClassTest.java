import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 06.02.2018.
 */
public class ArrEvenClassTest
{
    Logger log;

    public ArrEvenClassTest  ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrEven() throws Exception
    {
        ArrEvenClass arrEvenCall = new ArrEvenClass();
        log.trace("Positive scenario, method returns array with 2 numbers");
        int [] arr61 = {11, 20, 30};
        int [] mas61 = arrEvenCall.arrEven(arr61);
        int [] ans61 = {20, 30};
        Assert.assertArrayEquals(ans61,mas61);

        log.trace("Positive scenario, method returns null");
        int [] arr62 = {};
        int [] mas62 = arrEvenCall.arrEven(arr62);
        int [] ans62 = {20, 30};
        Assert.assertNull(mas62);
    }

}