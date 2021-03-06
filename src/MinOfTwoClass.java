/**
 * Created by sergii.ivashko on 05.02.2018.
 */


import org.apache.log4j.Logger;

public class MinOfTwoClass
{
    Logger log;

    public MinOfTwoClass ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("1. Дано два числа. Найти минимальное число из них.");
    }

    /**
     * Метод определяет минимальное из двух чисел
     * @param a
     * @param b
     * @return минимальное из двух
     */
    public long minOfTwo(long a, long b) {
        try
        {
            if (a < b)
            {
                log.trace("A is min. A: " + a);
                return a;
            }
            else
            {
                log.trace("B is min. B: " + b);
                return b;
            }
        }
        catch (Exception ex)
        {
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of minOfTwoMethod" + stackTrace);
            return -1;
        }
    }

}
