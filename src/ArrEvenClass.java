import org.apache.log4j.Logger;

import static java.lang.String.valueOf;

/**
 * Created by sergii.ivashko on 06.02.2018.
 */
public class ArrEvenClass
{
    Logger log;

    public ArrEvenClass ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    public int [] arrEven (int [] a)
    {
        try {
            int count = 0;
            for (int i = 0; i < a.length; i++)
            {
                if ((a[i] % 2) == 0)
                {
                    count++;
                }
            }
            if (count == 0)
            {
                log.trace("There are no even numbers in the array!");
                return null;
            }
            int[] result = new int[count];
            int index = 0;
            for (int i = 0; i < a.length; i++) {
                if ((a[i] % 2) == 0) {
                    result[index] = a[i];
                    index++;
                }
            }
            log.trace("There are " +  count + " even number(s) in the array!");
            return result;
        }
        catch (Exception ex)
        {
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of arrIsSortMethod" + stackTrace);
            return null;
        }
    }


}
