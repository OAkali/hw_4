import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя 5 раз:\n ");
        names.add(sc.next());
        names.add(sc.next());
        names.add(sc.next());
        names.add(sc.next());
        names.add(sc.next());

        System.out.println("сохранина в папке А : ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
        System.out.println("---------------------");
        ArrayList<String> namesB = new ArrayList<>();
        System.out.print("Введите имя 5 раз:\n ");
        namesB.add(sc.next());
        namesB.add(sc.next());
        namesB.add(sc.next());
        namesB.add(sc.next());
        namesB.add(sc.next());

        System.out.println("сохранина в папке B : ");
        for (String nameB : namesB) {
            System.out.println(nameB);
        }
        System.out.println("---------------------------");
        ArrayList<String> namesC = new ArrayList<>();
        namesC.addAll(names);
        namesC.addAll(namesB);
        System.out.println("Вложена в папку С \n"
                +namesC);
        System.out.println("\n");
        Collections.sort(namesC);
        System.out.println("От сортировона \n"+namesC);


    }
}