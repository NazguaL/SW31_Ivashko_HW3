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

    /* 5. Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.*/
    int [] arr5 = {10, 20, 25, 30, 35, 40, 45, 100, 200};
    ArrIsSortClass arrIsSortCall = new ArrIsSortClass();
    arrIsSortCall.arrIsSort(arr5);

    /* 6. Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести сообщение об этом факте.*/
    int [] arr6 = {11, 20, 30};
    ArrEvenClass arrEvenCall = new ArrEvenClass();
    int [] mas6 = arrEvenCall.arrEven(arr6);
    if (mas6 == null) System.out.println("There are no even numbers in the array!");
    else {
        System.out.println("There are following even numbers in the array:");
        for (int i = 0; i < mas6.length; i++) {
            System.out.print((mas6[i]) + " ");
        }
    }

    /* 7. Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.*/
    int z = 90;
    int [] h = {10, 20, 25, 30, 35, 40, 45, 100, 200};
    ArrReplaceZClass arrReplaceZCall = new ArrReplaceZClass();
    int [][] j = arrReplaceZCall.arrReplaceZ(h, z);
    //int [][] j = {{10, 20, 25, 30, 35, 40, 45, 100, 200},{2}};
    System.out.println("There are following numbers in the new array:");
    int l = j[0].length;
    for (int m = 0 ; m <l ; m++) {
        System.out.print((j[0][m]) + " ");
    }
    System.out.println();
    System.out.println("Total count of replacements: " + (j)[1][0]);



}

}
