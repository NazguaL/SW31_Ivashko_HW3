import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrReplaceMax2ZeroClass
{
    Logger log;

    public ArrReplaceMax2ZeroClass ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("18. Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.");
    }
    public int [] arrReplaceMax2Zero (int [] a)
    {
        try
        {
        int l = a.length;
        int maxindex = 0;
        for (int i = 0 ; i < l ; i++) {
            if (a[i] > a[maxindex]) {maxindex = i;}
        }
        int maxvalue = a[maxindex];
            log.trace("Max element value is: " + maxvalue);
        for (int i = 0 ; i < l ; i++) {
            if (a[i] == maxvalue) {
                a[i] = 0;
                log.trace("First max element index is: " + i);
                break;
            }
        }
        return a;
    }
    catch (Exception ex)
    {
        int [] returncatch = {-1};
        String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
        log.error("Exception of arrPosZerNegMethod" + stackTrace);
        return returncatch;
    }
    }

}
