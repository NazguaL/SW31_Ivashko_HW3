import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 08.02.2018.
 */
public class NewArrBasedOnKClass {
    Logger log;

    public NewArrBasedOnKClass() {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("19. Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.");
    }

    public int[] newArrBasedOnK(int[] a, int k)
    {
        try
        {
            int l = a.length;
            int count1 = 0;

            for (int i = 0; i < l; i++) {
                if ((a[i]) % 10 == k) {
                    count1++;
                }
            }
            int[] result = new int[count1];
            int count2 = 0;
            for (int i = 0; i < l; i++) {
                if ((a[i]) % 10 == k) {
                    result[count2] = a[i];
                    count2++;
                }
            }

            return result;
        }
        catch (Exception ex)
        {
            int[] resultcatch = {-1};
            String stackTrace = org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(ex);
            log.error("Exception of NewArrBasedOnKClassMethod" + stackTrace);
            return resultcatch;
        }
    }

}
