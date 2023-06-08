import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
/*
* Первый семинар.
* 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
* 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
* 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в
* массив m1
* 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и
* сохранить в массив m2
*/
public class Hometask 
{
    public static void main(String[] args) 
    {
        int i = get_Random_Num(0, 2000);
        System.out.println(i);
        int n = get_Most_Significant_bit(i);
        System.out.println(n);
        int[] m1 = get_divisible_array(i, n);
        // System.out.println(Arrays.toString(m1));
        System.out.println();
        int[] m2 = get_non_divisible_array(i, n);
        // System.out.println(Arrays.toString(m2));
    }

    // 1. Метод первого задания
    static int get_Random_Num (int min_num, int max_num)
    {
        Random random = new Random();
        System.out.print("Случайное число = ");
        return random.nextInt(min_num, max_num);
    }

    // 2. Метод второго задания
    static int get_Most_Significant_bit (int num) 
    {
        int count = 0;
        while (num >= 2) 
        {
            count++;
            num /= 2;
        }
        System.out.print("Номер старшего бита = ");
        return count;
    }

    // 3. Метод третьего задания
    static int[] get_divisible_array (int num, int bit_num)
    {
        int lenght = 0;
        for (int j = num; j < Short.MAX_VALUE; j++) 
        {
            if (j % bit_num == 0) lenght++;
        }
        System.out.printf("Длина массива чисел, кратных n равно --> %d", lenght);

        int[] array = new int[lenght];
        int index = 0;
        for (int j = num; j < Short.MAX_VALUE; j++) 
        {
            if (j % bit_num == 0) 
            {
                array[index] = j;
                index++;
            }
        }
        return array;
    }

    // 4. Метод четвортого задания
    static int[] get_non_divisible_array(int num, int bit_num) {
        int lenght = 0;
        for (int j = Short.MIN_VALUE; j < num; j++) {
            if (j % bit_num != 0)
                lenght++;
        }
        System.out.printf("Длина массива чисел, не кратных n равно --> %d", lenght);

        int[] array = new int[lenght];
        int index = 0;
        for (int j = Short.MIN_VALUE; j < num; j++) {
            if (j % bit_num != 0) {
                array[index] = j;
                index++;
            }
        }
        return array;
    }
}