import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 06.02.2018.
 */
public class ArrIsSortClass
{
    Logger log;

    public ArrIsSortClass ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    public boolean arrIsSort(int [] a)
    {
        try
        {
            boolean Sorted = true;
            int i = 0;
            while (Sorted == true && i < a.length - 1)
            {
                if (a[i] > a[i + 1]) Sorted = false;
                i++;
            }
            log.trace("Result of arrIsSortMethod: " + Sorted);
            return Sorted;
        }
        catch (Exception ex)
        {
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of arrIsSortMethod" + stackTrace);
            return false;
        }
    }

}
