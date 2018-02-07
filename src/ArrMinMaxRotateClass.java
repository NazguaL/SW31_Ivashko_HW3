import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 07.02.2018.
 */
public class ArrMinMaxRotateClass
{
    Logger log;

    public ArrMinMaxRotateClass  ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.");
    }

    public int [] arrMinMaxRotate (int [] a) {
        try {
            int l = a.length;
            int maxindex = 0;
            int minindex = 0;
            for (int i = 0; i < l; i++)
            {
                if (a[i] > a[maxindex]) {
                    maxindex = i;
                }
                if (a[i] < a[minindex]) {
                    minindex = i;
                }
            }
            log.trace("Index of Max element: " + maxindex);
            log.trace("Index of Min element: " + minindex);
            int temp = a[maxindex];
            a[maxindex] = a[minindex];
            a[minindex] = temp;

            return a;
        } catch (Exception ex) {
            int [] resultcatch = {-1};
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of arrPosZerNegMethod" + stackTrace);
            return resultcatch;
        }
    }

}
