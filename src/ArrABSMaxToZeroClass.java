import org.apache.log4j.Logger;


/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrABSMaxToZeroClass
{
    Logger log;

    public ArrABSMaxToZeroClass  ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых по модулю больше максимального числа.");
    }

    public int [] arrABSMaxToZero (int [] a)
    {
        try
        {
            int l = a.length;
            int maxindex = 0;
            for (int i = 0; i < l; i++) {
                if (a[i] > a[maxindex]) {
                    maxindex = i;
                }
            }
            log.trace("Max element value is " + a[maxindex]);
            for (int i = 0; i < l; i++) {
                if ((Math.abs(a[i])) > a[maxindex]) {
                    a[i] = 0;
                    log.trace("Changed element index is " + i);
                }
            }
            return a;
        }
        catch (Exception ex)
        {
            int [] returncatch = {-1};
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of arrABSMaxToZeroMethod" + stackTrace);
            return returncatch;
        }
    }
}
