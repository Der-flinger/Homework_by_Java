import java.util.ArrayList;
import java.util.Scanner;

public class use_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> id = new ArrayList<>();
        ArrayList<String> surnameArray = new ArrayList<>();
        ArrayList<String> firstNameArray = new ArrayList<>();
        ArrayList<String> patronymicArray = new ArrayList<>();
        ArrayList<String> ageArray = new ArrayList<>();
        ArrayList<String> genderArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(!(System.in).equals("q")) {
            System.out.println("new data entering");
            System.out.println("Enter surname --> ");
            String surname = sc.nextLine();
            surnameArray.add(surname);
            System.out.println("Enter first name --> ");
            String firstName = sc.nextLine();
            firstNameArray.add(firstName);
            System.out.println("Enter patronymic --> ");
            String patronymic = sc.nextLine();
            patronymicArray.add(patronymic);
            System.out.println("Enter age --> ");
            String age = sc.nextLine();
            ageArray.add(age);
            System.out.println("Enter gender --> ");
            String gender = sc.nextLine();
            genderArray.add(gender);
        }
        System.out.println(surnameArray);
        // for (int j = 0; j < args.length; j++) {
        //     System.out.printf("%s %s %s %s %s", surnameArray.get(j), firstNameArray.get(j), patronymicArray.get(j), ageArray.get(j), genderArray.get(j));
        // }
    }
}
