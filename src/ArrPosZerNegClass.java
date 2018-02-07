import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 07.02.2018.
 */
public class ArrPosZerNegClass
{
    Logger log;

    public ArrPosZerNegClass ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.");
    }

    public int [] arrPosZerNeg (int [] a)
    {
        try
        {
            int[] result = new int[3];
            int l = a.length;
            for (int i = 0; i < l; i++) {
                if (a[i] < 0) {
                    result[0]++;
                } else if (a[i] == 0) {
                    result[1]++;
                } else {
                    result[2]++;
                }
            }
            log.trace("There are negative numbers count in the array: " + result[0]);
            log.trace("There are \"zero\" numbers count in the array: " + result[1]);
            log.trace("There are positive numbers count in the array: " + result[2]);
            return result;
        }
        catch (Exception ex)
        {
            int[] resultcatch = {-1, -1, -1};
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of arrPosZerNegMethod" + stackTrace);
            return resultcatch;
        }
    }
}
