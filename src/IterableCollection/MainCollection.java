package IterableCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainCollection {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Richi");
        names.add("umi");
        names.addAll(List.of("Sri", "Kezia", "Dina", "Tiyo"));


        // loop data
        System.out.println("collection names Before ");
        for (String name: names){
            System.out.println(name);
        }
        System.out.println(names.contains("Richi"));

        names.remove("Richi");
        names.removeAll(Arrays.asList("Dina", "Tiyo"));
        System.out.println("collection names After");

        for (String name: names){
            System.out.println(name);
        }
        System.out.println(names.contains("Richi"));

        System.out.println(" ");

        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Yoga", "Depok"));
        persons.add(new Person(2, "Yusuf", "Padang"));
        persons.add(new Person(3, "Densa", "Medan"));
        persons.addAll(Arrays.asList(new Person(4,"Minato", "Tokyo" )));
        persons.addAll(Arrays.asList(
                new Person(5, "Opic", "Sukabumi"),
                new Person(6, "Ujang", "Cikukulu")
        ));

        for (Person person: persons){
            System.out.println(person);
        }

        System.out.println(" ");
        System.out.println("Setelah di remove");

//        persons.remove(Person(3, "Densa", "Medan"));
//        persons.removeAll()
        for (Person person: persons){
            System.out.println(person);
        }



    }
}
