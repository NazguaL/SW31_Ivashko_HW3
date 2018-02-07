import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 06.02.2018.
 */
public class ArrReplaceZClassTest
{
    Logger log;

    public ArrReplaceZClassTest ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }
    @Test
    public void arrReplaceZ() throws Exception
    {
        ArrReplaceZClass arrReplaceZCall = new ArrReplaceZClass();
        int z = 90;
        log.trace("Positive scenario, method returns array with 2 replacements");
        int [] arr71 = {10, 20, 25, 30, 35, 40, 45, 100, 200};
        int [][] mas71 = arrReplaceZCall.arrReplaceZ(arr71, z);
        int [] [] ans71 = {{10, 20, 25, 30, 35, 40, 45, 90, 90},{2}};
        Assert.assertArrayEquals(ans71, mas71);
        log.trace("Positive scenario, method returns array with 0 replacements");
        int [] arr72 = {10, 20, 25, 30, 35, 40, 45, 70, 75};
        int [][] mas72 = arrReplaceZCall.arrReplaceZ(arr72, z);
        int [] [] ans72 = {{10, 20, 25, 30, 35, 40, 45, 70, 75},{0}};
        Assert.assertArrayEquals(ans72, mas72);
    }
}