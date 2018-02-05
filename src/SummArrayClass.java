import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class SummArrayClass
{

    Logger log;

    public SummArrayClass()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
    }

    /**
     * Метод возвращает сумму елементов мессива, кратных переданному числу.
     *
     * @param a Массив на вход
     * @param k часло кратноести
     * @return сумма элементов, кратных k
     */

    public int summArray(int[] a, int k)
    {
        try
        {
                int result = 0;
                for (int i = 0; i < a.length; i++) {
                    if ((a[i]) % k == 0)
                    {
                        log.trace("(a[i]) % k = " + ((a[i]) % k));
                        log.trace("i = " + (i));
                        result = result + a[i];
                        log.trace("result = " + (result));
                    }
                }

                log.trace("Sum of elements multiply of " + k + " is equals to: " + result);
                return result;
        }
        catch (Exception ex)
        {
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of minOfTwoMethod" + stackTrace);
            return -1;
        }

    }
}
