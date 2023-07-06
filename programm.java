import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/**
 * Разработать программу, имитирующую поведение коллекции HashSet. 
 * В программе содать метод add добавляющий элемент, метод toString возвращающий строку 
 * с элементами множества и метод позволяющий читать элементы по индексу.
 ** Реализовать все методы из семинара.
 * Формат данных Integer.
 */
public class programm {

    public static void main(String[] args) {
        var list = new newSet();
        list.add(12);
        list.add(16);
        list.add(-1);
        list.add(3321);
        list.printSet();
        list.delete(16);
        list.printSet();
        list.getElement(2);
    }
}

/**
 * newSet
 */
class newSet {
    ArrayList<Integer> set = new ArrayList<>();

    HashMap<Integer, Object> ownSet= new HashMap<>();
    private static final Object OBJECT = new Object();
    
    public void add(int element) {
        ownSet.put(element, OBJECT);
    }

    public void printSet(){
        for (int element : ownSet.keySet()) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public void delete(int element) {
        ownSet.remove(element);
    }

    public boolean isEmpty() {
        return ownSet.isEmpty();
    }

    public void getElement(int index) {
        int i = 0;
        for (int element : ownSet.keySet()) {
            set.add(i, element);
            i++;
        }
        System.out.println(set.get(index));
    }
}