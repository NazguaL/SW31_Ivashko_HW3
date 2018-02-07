import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;

/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class ArrPosNegClass
{
    Logger log;

    public ArrPosNegClass ()
    {
        log = Logger.getLogger(String.valueOf(getClass()));
        log.trace("");
        log.trace("4. Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число встречается раньше – положительное или отрицательное.");
    }

    public int arrPosNeg(int [] a)

    {
        int flag = 0;
        int i = 0;
        int l = a.length;
        while ( flag == 0 && i < l)
        {

            if (a[i] > 0) {
                flag = 1;
            }
            else if (a[i] < 0) {
                flag = -1;
            }
            else {
                flag = 0;
            }
            i++;
        }

        /**System.out.println("");
        if (flag == 1) { System.out.println("Positive");}
        else if (flag == -1) {System.out.println("Negative");}
        else {System.out.println("Array containts no elements or only zero elements");}
         **/
        log.trace("Method returns : " + flag);
        return flag;
    }

}
