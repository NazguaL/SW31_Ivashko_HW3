import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class ArrP1P2Class
{
    Logger log;

    public ArrP1P2Class ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("17. Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.\n" +
                "Сравнить модуль Р 2  с модулем Р 1  и указать, какое из произведений по модулю больше.:");
    }

    public long [] arrP1P2 (int [] a)
    {
    try {
        long [] result = new long [3];
        int l = a.length;
        long P1 = 1;
        long P2 = 1;
        int flag = 1;

        for (int i = 0 ; i < l ; i++) {
            if (a[i] < 0) { P1 = P1 * a[i];}
            if (a[i] > 0) { P2 = P2 * a[i];}
        }

        if ( (Math.abs(P1)) > (Math.abs(P2)) ) { flag = 0; }

        result [0] = flag;
        result [1] = P1;
        log.trace("P1 is equals to: " + P1);
        result [2] = P2;
        log.trace("P2 is equals to: " + P2);
        return result;
    }
    catch (Exception ex)
    {
        long [] resultcatch = {};
        resultcatch [0] = -1;
        resultcatch [1] = -1;
        resultcatch [2] = -1;
        String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
        log.error("Exception of ArrP1P2ClassMethod" + stackTrace);
        return resultcatch;
    }
    }

}
