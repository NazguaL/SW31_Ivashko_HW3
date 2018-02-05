/**
 * Created by sergii.ivashko on 05.02.2018.
 */
public class CallHelper {

public void caller ()
{

    /* 1. Дано два числа. Найти минимальное число из них.*/
    long a1 = 3000;
    long b1 = 3001;
    MinOfTwoClass miOfTwoCall = new MinOfTwoClass();
    System.out.println(miOfTwoCall.minOfTwo(a1, b1));

    /* 2. Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.*/
    int [] arr2 = {27, 15, 37, 33, 42, 35};
    int k = 7;
    SummArrayClass summArrayCall = new SummArrayClass();
    System.out.println(summArrayCall.summArray(arr2, k));

}

}
