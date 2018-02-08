import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrIntProductClassTest
{
    Logger log;

    public ArrIntProductClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    @Test
    public void arrIntProduct() throws Exception
    {
        ArrIntProductClass arrIntProductCall = new ArrIntProductClass();

        log.trace("Positive scenario, method returns 80000000");
        int [] arr151 = {3000, 1000, 25, 30, 35, 400, 45, 100, 8000, 7, 10000};
        int m151 = 5000;
        long ans151 = arrIntProductCall.arrIntProduct(arr151,m151);
        Assert.assertEquals(80000000, ans151);

        log.trace("Positive scenario, method returns 0");
        int [] arr152 = {};
        int m152 = 0;
        long ans152 = arrIntProductCall.arrIntProduct(arr152,m152);
        Assert.assertEquals(0, ans152);
    }

}