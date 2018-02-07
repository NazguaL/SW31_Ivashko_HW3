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
    int [] h = {};
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


    /* 8. Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/
    System.out.println();
    int [] n = {-10, 0, 25, 30, 35, 40, 45, 100, 200};
    ArrPosZerNegClass arrPosZerNegCall = new ArrPosZerNegClass();
    int [] o = arrPosZerNegCall.arrPosZerNeg(n);
    System.out.println("There are negative numbers count in the array: " + o[0]);
    System.out.println("There are zero numbers count in the array: " + o[1]);
    System.out.println("There are positive numbers count in the array: " + o[2]);
    System.out.println();

    /*9. Дан массив чисел. Поменять местами наибольший и наименьший элементы.*/
    int [] m9 = {3000, -1000, 25, 30, 35, 400, 45, 100, -8000};
    ArrMinMaxRotateClass arrMinMaxRotateCall = new ArrMinMaxRotateClass();
    int [] a9 = arrMinMaxRotateCall.arrMinMaxRotate(m9);
    System.out.println("There are following numbers in the new array:");
    int l9 = a9.length;
    for (int m = 0 ; m <l9 ; m++) {
        System.out.print((a9[m]) + " ");
    }
    System.out.println();
    System.out.println();

    /*12. Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3].*/
    int [] arr12 = {1, 3, 2, 5, 3, 4, 7};
    ArrRevert2Class arrRevert2Call = new ArrRevert2Class();
    int [] mas12 = arrRevert2Call.arrRevert2(arr12);
    int l12 = mas12.length;
    for (int m = 0 ; m <l12 ; m++) {
        System.out.print((mas12[m]) + " ");
    }
    System.out.println();
    System.out.println();
}

}
