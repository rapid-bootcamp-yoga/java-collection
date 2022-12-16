package IterableCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Sitti", "Makrif","santi", "jira"));
        System.out.println(names);

        names.set(2, "Aisyah");
        names.set(0, "Joko");
        System.out.println(names);

        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person(1, "Joko tTingkir", "Jakarta"),
                        new Person(2, "Andi", "Jakarta"),
                        new Person(3, "Budi", "Jakarta")
                )
        );

        System.out.println("Before list");
        for (int i = 0; i < persons.size(); i++){
            System.out.println("Index ke "+ i + " : " +persons.get(i));
        }

        System.out.println("Setelah dirubah");
        persons.set(1, new Person(2, "Yoga Prasutiyo", "Lampung"));
        for (int i = 0; i < persons.size(); i++){
            System.out.println("Index ke "+ i + " : " +persons.get(i));
        }
    }
}
