import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



/**
 * Организовать ввод и хранение данных пользователей. ФИО возраст и пол
 * вывод в формате Фамилия И.О. возраст пол
 * добавить возможность выхода или вывода списка отсортированного по возрасту!)
 * реализовать сортировку по возрасту с использованием индексов
 * реализовать сортировку по возрасту и полу с использованием индексов
 */
public class task {

    public static void main(String[] args) {
        ArrayList<String> surnameArray = new ArrayList<>();
        ArrayList<String> firstNameArray = new ArrayList<>();
        ArrayList<String> patronymicArray = new ArrayList<>();
        ArrayList<String> ageArray = new ArrayList<>();
        ArrayList<String> genderArray = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        System.out.print(
                "Введите 1 чтобы заполнить данные вручную, в другом случае программа будет работать с существующим файлом --> ");
        String key = System.console().readLine();
        System.out.println(key);

        if (key.equals("1")) {
            enterData();
        } else {
            System.out.println("Выбрана работа с существующим файлом");
            System.out.println();
        }

        try {
            BufferedReader bf;
            if (key.equals("1")) {
                bf = new BufferedReader(new FileReader("data1.txt"));
            } else {
                bf = new BufferedReader(new FileReader("data2.txt"));
            }

            String line;
            String[] tempArray = new String[5];
            int i = 0;
            while ((line = bf.readLine()) != null) {
                tempArray = line.split(" ");
                surnameArray.add(tempArray[0]);
                firstNameArray.add(tempArray[1]);
                patronymicArray.add(tempArray[2]);
                ageArray.add(tempArray[3]);
                genderArray.add(tempArray[4]);
                id.add(i);
                i++;
            }
            bf.close();
            for (int j = 0; j < surnameArray.size(); j++) {
                System.out.println(id.get(j) + ": " + surnameArray.get(j) +
                        " " + firstNameArray.get(j) +
                        " " + patronymicArray.get(j) +
                        ", " + ageArray.get(j) +
                        ", " + genderArray.get(j));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        // sc.close();

        System.out.println("Введите 'sort' для сортировки данных по возрасту");
        String key2 = System.console().readLine();

        ArrayList<Integer> ageArrayInt = ageArrayToInt(ageArray);
        
        if (key2.equals("sort")) {
            Collections.sort(id, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    // TODO Auto-generated method stub
                    return ageArrayInt.get(o1) - ageArrayInt.get(o2);
                }
            });
            System.out.println("Сортировка завершена, результат ниже");
            for (int i = 0; i < id.size(); i++) {
                System.out.println(id.get(i) + ": " + surnameArray.get(id.get(i)) +
                        " " + firstNameArray.get(id.get(i)) +
                        " " + patronymicArray.get(id.get(i)) +
                        ", " + ageArray.get(id.get(i)) +
                        ", " + genderArray.get(id.get(i)));
            }
        }
        // System.out.println(id);
    }

    public static void enterData() {
        try {
            File file = new File("data1.txt");
            if (!file.exists())
                file.createNewFile();
            // Scanner enter = new Scanner(System.in, "CP866");
            PrintWriter pw = new PrintWriter(file);
            System.out.println("Введите ФИО, возраст и пол через пробел в одну строку");
            System.out.println("Для завершения ввода, введите 'exit'");
            // String dataLine = enter.nextLine();
            String dataLine = System.console().readLine();
            pw.println(dataLine);
            while (true) {
                // dataLine = enter.nextLine();
                dataLine = System.console().readLine();
                if (dataLine.equals("exit"))
                    break;
                // System.out.println(dataLine);
                pw.println(dataLine);
                // tmp = (dataLine.split(" "));
            }
            // enter.close();

            pw.close();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public static ArrayList<Integer> ageArrayToInt(ArrayList<String> array) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            // array.get(i) = String.parseInt(array.get(i));
            res.add(Integer.parseInt(array.get(i)));
        }
        return res;

    }
}