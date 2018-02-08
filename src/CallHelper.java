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


    System.out.println("14. Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).:");
    int [] arr14 = {-100, 3000, -1000, 25, 30, 35, 400, 45, 100, -8000, 7, 10000};
    ArrMinMaxClass arrMinMaxCall = new  ArrMinMaxClass();
    int [] mas14 = arrMinMaxCall.arrMinMax(arr14);
    System.out.println("mаx(а[0], а[2], ..., а[2к]): " + mas14[0]);
    System.out.println("min(а[1], а[3], …, а[2к-1]): " + mas14[1]);
    System.out.println();

    /*15. Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.*/
    System.out.println("15. Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше заданного числа М. Если таких нет, то выдать сообщение об этом.:");
    int [] arr15 = {3000, 1000, 25, 30, 35, 400, 45, 100, 8000, 7, 10000};
    int m15 = 5000;
    ArrIntProductClass arrIntProductCall = new ArrIntProductClass();
    long a15 = arrIntProductCall.arrIntProduct(arr15,m15);
    if (a15 == 0) {System.out.println("There are no numbers more than "+ m15 + " in the array.");}
    else {System.out.println("Production of numbers more than " + m15 +  " is: " + a15);}
    System.out.println();

    /* 16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых по модулю больше максимального числа.*/
    System.out.println("16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых по модулю больше максимального числа.:");
    //int [] arr16 = {3000, 1000, 25, 30, 35, 400, 45, 100, -8000, 7, -10000};
    int [] arr16 = {};
    ArrABSMaxToZeroClass arrABSMaxToZeroCall = new  ArrABSMaxToZeroClass();
    int [] a16 = arrABSMaxToZeroCall.arrABSMaxToZero(arr16);
    int l16 = a16.length;
    System.out.println("There are following numbers in the new array:");
    for (int m = 0 ; m <l16 ; m++) {
        System.out.print((a16[m]) + " ");
    }
    System.out.println();
    System.out.println();

    /*17. Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
    Сравнить модуль Р 2  с модулем Р 1  и указать, какое из произведений по модулю больше.*/
    int [] arr17 = {-30, 10, -25, 30, -35, 40, -45, 10, -80, 7, -10};
    ArrP1P2Class arrP1P2Call = new  ArrP1P2Class();
    long [] a17 = arrP1P2Call.arrP1P2(arr17);
    System.out.println("P1 is equals to: " + a17[1]);
    System.out.println("P2 is equals to: " + a17[2]);
    if (a17[0] == 0) {System.out.println("Module of P1 is higher than module of P2");}
    else {System.out.println("Module of P2 is higher than module of P1");}
    System.out.println();

    /* 18. Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.*/
    int [] arr18 = {3000, 1000, 25, 30, 35, 400, 45, 100, 8000, 7, 8000};
    ArrReplaceMax2ZeroClass arrReplaceMax2ZeroCall = new  ArrReplaceMax2ZeroClass();
    int [] a18 = arrReplaceMax2ZeroCall.arrReplaceMax2Zero(arr18);
    System.out.println("There are following numbers in the new array:");
    int l18 = a18.length;
    for (int m = 0 ; m <l18 ; m++) {
        System.out.print((a18[m]) + " ");
    }
    System.out.println();
    System.out.println();

    /*19. Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.:*/

    int[] arr19 = {3001, 1002, 25, 33, 35, 404, 45, 106, 8007, 7, 8008};
    NewArrBasedOnKClass newArrBasedOnKCall = new NewArrBasedOnKClass();
    int k19 = 5;
    int[] a19 = newArrBasedOnKCall.newArrBasedOnK(arr19, k19);
    int l19 = a19.length;
    for (int m = 0; m < l19; m++) {
        System.out.print((a19[m]) + " ");
    }
    System.out.println();


}

}
