import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class ArrWithZeroClass
{
    Logger log;

    public ArrWithZeroClass ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("3. В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.");
    }

    public int [] arrWithZero(int[] a)
    {
        try
        {
            int count = 0;
            int l = a.length;
            for (int i = 0; i < l; i++)
            {
                if (a[i] == 0) {
                    count++;
                }
            }
            log.trace("Count of \"zero\" elements: " + count);
            int[] result = new int[count];
            int index = 0;
            for (int i = 0; i < l; i++)
            {
                if (a[i] == 0)
                {
                    result[index] = i;
                    index++;
                }
            }
            return result;
        }
        catch (Exception ex)
        {
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of minOfTwoMethod" + stackTrace);
            int [] arr = {-1};
            return arr;
        }
    }
}

