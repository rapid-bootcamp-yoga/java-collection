package IterableCollection;

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
        for (String name: names){
            System.out.println(name);
        }

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

    }
}
