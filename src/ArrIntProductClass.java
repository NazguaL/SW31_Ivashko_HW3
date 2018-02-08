import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrIntProductClass
{
    Logger log;

    public ArrIntProductClass  ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("15. Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.");
    }

    public long arrIntProduct (int [] a, int m) {
        try {
            int l = a.length;
            long result = 1;
            int count = 0;
            for (int i = 0; i < l; i++) {
                if (a[i] > m) {
                    result = result * a[i];
                    count++;
                }
            }
            if (count == 0) {
                result = 0;
            }
            return result;
        }
        catch (Exception ex)
        {
            int [] resultcatch = {-1};
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of arrIntProductMethod" + stackTrace);
            return -1;
        }
    }

}
