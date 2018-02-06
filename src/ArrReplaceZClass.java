import org.apache.log4j.Logger;

/**
 * Created by sergii.ivashko on 06.02.2018.
 */
public class ArrReplaceZClass
{
        Logger log;

    public ArrReplaceZClass ()
        {
            log = Logger.getLogger(String.valueOf(getClass()));
        }

    public int [][] arrReplaceZ (int [] a, int z)
    {
        int l = a.length;

        int [][] result = new int [2][];
        result [0] = new int [l];
        result [1] = new int [1];

        int count =0;
        for (int i = 0 ; i < l ; i++) {
            if (a[i] > z) {result [0][i] = z; count++;}
            else {result [0][i] = a[i];}

        }
        log.trace("Total count of replacements: " + count);
        result [1][0] = count;
        return result;
}
}
