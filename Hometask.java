import java.util.Random;

/*
* Первый семинар.
* 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
* 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
* 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в
* массив m1
* 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и
* сохранить в массив m2
*/
public class Hometask {
    public static void main(String[] args) {
        int i = get_Random_Num(0, 2000);
        System.out.println(i);

    }

    // Метод первого задания
    static int get_Random_Num (int min_num, int max_num)
    {
        Random random = new Random();
        System.out.print("Случайное число = ");
        return random.nextInt(min_num, max_num);
    }


}