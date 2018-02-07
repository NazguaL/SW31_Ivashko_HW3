import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 07.02.2018.
 */
public class ArrRevert2Class
{
    Logger log;

    public ArrRevert2Class ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("12. Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3].");
    }

    public int [] arrRevert2 (int [] a)
    {
        try
        {
            int k = a.length;
            int temp;
            for (int i = 1; i < k; i = i + 2) {
                temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
            return a;
        } catch (Exception ex) {
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of arrPosZerNegMethod" + stackTrace);
            int [] returncatch = {-1};
            return returncatch;
        }
    }


}
