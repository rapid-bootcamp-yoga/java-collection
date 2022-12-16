package SortedSet;

import model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class MainSortedSet {
    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator());
        persons.add(new Person(1,"Joko","Jakarta"));
        persons.add(new Person(2,"Sugeng","Yogya"));
        persons.add(new Person(3,"Andi","Surabaya"));
        persons.add(new Person(4,"Randi","Surabaya"));
        persons.add(new Person(5,"Rudi","Surabaya"));
        persons.add(new Person(6,"Ridho","Bandung"));

        for (Person p: persons){
            System.out.println(p);
        }

        NavigableSet<Person> personNav = new TreeSet<>(new PersonComparator());
        personNav.add(new Person(1,"Joko","Jakarta"));
        personNav.add(new Person(3,"Andi","Surabaya"));
        personNav.add(new Person(4,"Randi","Surabaya"));
        personNav.add(new Person(5,"Rudi","Surabaya"));
        personNav.add(new Person(6,"Ridho","Bandung"));

        for (Person p: personNav){
            System.out.println(p);
        }

        System.out.println("\nSetelah dibalik");
        List<Person> personNav2 = personNav.stream().sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());
        for (Person p: personNav2){
            System.out.println(p);
        }


    }
}
