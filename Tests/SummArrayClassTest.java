import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class SummArrayClassTest {
    @Test
    public void summArray() throws Exception
    {
        SummArrayClass summArrayCall = new SummArrayClass();
        int [] arr2 = {27, 15, 37, 33, 42, 35};
        int k = 7;
        Assert.assertEquals(77, summArrayCall.summArray(arr2, k));
    }

}