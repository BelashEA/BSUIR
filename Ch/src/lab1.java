import java.util.Scanner;

public class lab1 {
    public static void main(String args[ ])
    {
        //zad1(arrayFirst());
        //zad2(arraySecond());
        //zad3(arrayFirst());

        zad5(arraySecond());

    }
    public static int[] arrayFirst(){
        System.out.println( "Input number from keyboard" );
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static int[][] arraySecond(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива по вертикали");
        a = sc.nextInt();
        System.out.println("Введите размерность массива по гаризонтали");
        b = sc.nextInt();

        int[][] array = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = (int)(Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
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
        System.out.println(array.length);
        System.out.println(mid);

        if (array[0].length % 2 == 0){
            for (int i = 0; i < array.length; i++) {
                zam = array[i][mid - 1];
                array[i][mid - 1] = array[i][mid];
                array[i][mid] = zam;
            }
        }




    }
}
