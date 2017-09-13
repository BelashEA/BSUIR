import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class lab1 {
    public static void main(String args[ ])
    {
        try {
            //zad1(arrayFirst());

            //zad3(arrayFirst());
        }catch (Exception e){
            System.out.println("Необходимо вводить только числа больше 0. Попробуйте еще раз.");
        }

        try {
            //zad2(arraySecond());

            //zad5(arraySecond());
            zad6(arraySecond());
        } catch (Exception e) {
            System.out.println("Необходимо вводить только числа больше 0. Попробуйте еще раз.");
        }

    }
    public static int[] arrayFirst() throws Exception{
        System.out.println( "Input number from keyboard" );
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        printArrayFirst(array);
        return array;
    }

    public static int[][] arraySecond() throws Exception{
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива по вертикали");
        a = sc.nextInt();
        System.out.println("Введите размерность массива по гаризонтали");
        b = sc.nextInt();

        int[][] array = new int[a][b];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)((Math.random() * 20) - 10);
            }
        }
        printArraySecond(array);
        return array;
    }

    public static void printArrayFirst(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printArraySecond(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zad1(int[] array){
        //7.Подсчитать количество нечетных элементов.
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] == 0) | ((array[i] % 2) != 0))
            {
                count++;
            }
        }
        System.out.println("Количество нечетных чисел: " + count);
    }

    public static void zad2(int[][] array){
        //7.Подсчитать количество нечетных элементов.
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((array[i][j] == 0) | ((array[i][j] % 2) != 0)) count++;
            }
        }
        System.out.println("Количество нечетных чисел: " + count);
    }

    public static void zad3(int[] array){
        //7.Найти номер последнего максимального элемента.
        int l = 0;
        int max;

        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max)
            {
                l = i;
                max = array[i];
            }
        }
        System.out.println("Номер максимального элемента: " + l);
    }

    public static void zad5(int[][] array){
        /*7.Поменять местами два средних столбца, если количество столбцов четное,
            и первый со средним столбцом, если количество столбцов нечетное.
         */
        int zam = 0;
        int mid = array[0].length / 2;

        if (array[0].length % 2 == 0){
            for (int i = 0; i < array.length; i++) {
                zam = array[i][mid - 1];
                array[i][mid - 1] = array[i][mid];
                array[i][mid] = zam;
            }
        }else {
            for (int i = 0; i < array.length; i++) {
            zam = array[i][mid];
            array[i][mid] = array[i][0];
            array[i][0] = zam;
            }
        }
        printArraySecond(array);



    }

    public static void zad6(int[][] array){
        /*7.Для каждого столбца подсчитать сумму четных положительных
            элементов и записать данные в новый массив.
         */
        int[] sum = new int[array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0){
                    sum[j] = sum[j] + array[i][j];
                }
            }
        }
        printArrayFirst(sum);
    }
}
