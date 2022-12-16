package IterableCollection;

import model.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterable {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Yoga Julian", "Julian", "Tina", "Tiyo");
//        for(var name: names) {
//            System.out.println(name);
//        }

        //iterator
        Iterator<String> namesIterator = names.iterator();
        while ( namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        Iterable<Person> persons = Arrays.asList(
                new Person(1, "Yoga Julian","Depok"  ),
                new Person(2, "Julian","Jepang"  ),
                new Person(3, "Tiyo","Indonesia"  ),
                new Person(4, "Sameka","Bogor"  )
        );

//        for (var person :persons){
//            System.out.println(person);
//        }

        //iterator
        Iterator<Person> personIterator = persons.iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
    }
}
