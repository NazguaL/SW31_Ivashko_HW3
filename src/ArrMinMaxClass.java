import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrMinMaxClass
{
    Logger log;

    public ArrMinMaxClass  ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).");

    }

    public int [] arrMinMax (int [] a)
    {
        try
        {
            int[] result = new int[2];
            int l = a.length;
            int maxindex = 0;
            int minindex = 0;
            for (int i = 1; i < l; i = i + 2)
            {
                if (a[(i - 1)] > a[maxindex]) {
                    maxindex = (i - 1);
                }
                if (a[(i)] < a[minindex]) {
                    minindex = i;
                }
            }
            result[0] = a[maxindex];
            result[1] = a[minindex];
            return result;
        }
        catch (Exception ex)
        {
            int [] resultcatch = {-1};
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of arrMinMaxMethod" + stackTrace);
            return resultcatch;
        }
    }
}
