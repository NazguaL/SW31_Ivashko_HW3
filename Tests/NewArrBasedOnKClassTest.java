import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class NewArrBasedOnKClassTest
{
    Logger log;

    public NewArrBasedOnKClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void newArrBasedOnK() throws Exception
    {
        NewArrBasedOnKClass newArrBasedOnKCall = new NewArrBasedOnKClass();
        log.trace("Positive scenario, method returns array : 25, 35, 45");
        int[] arr191 = {3001, 1002, 25, 33, 35, 404, 45, 106, 8007, 7, 8008};
        int k191 = 5;
        int[] mas191 = newArrBasedOnKCall.newArrBasedOnK(arr191, k191);
        int[] ans191 = {25, 35, 45};
        Assert.assertArrayEquals(ans191, mas191);

        log.trace("Positive scenario, method returns empty array.");
        int[] arr192 = {3001, 1002, 25, 33, 35, 404, 45, 106, 8007, 7, 8008};
        int k192 = 0;
        int[] mas192 = newArrBasedOnKCall.newArrBasedOnK(arr192, k192);
        int[] ans192 = {};
        Assert.assertArrayEquals(ans192, mas192);

        log.trace("Positive scenario, method returns empty array.");
        int[] arr193 = {};
        int k193 = 0;
        int[] mas193 = newArrBasedOnKCall.newArrBasedOnK(arr193, k193);
        int[] ans193 = {};
        Assert.assertArrayEquals(ans193, mas193);
    }

}