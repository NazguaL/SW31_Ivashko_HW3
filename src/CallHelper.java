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

    /* 3. В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.*/
    int [] arr3 = {20, 0, 15, 30, 30, 40, 30, 0};
    ArrWithZeroClass arrWithZeroCall = new ArrWithZeroClass();
    int [] mas3 = arrWithZeroCall.arrWithZero(arr3);
    for (int i = 0; i < mas3.length; i++)
    {
        System.out.println(mas3[i]);
    }

    /* 4. Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число встречается раньше – положительное или отрицательное.*/
    int [] arr4 = {0, 0, 15, 30, 30, 40, 30, 0};
    ArrPosNegClass arrPosNegCall = new ArrPosNegClass();
    int res4 = arrPosNegCall.arrPosNeg(arr4);
    System.out.println(res4);

}

}
