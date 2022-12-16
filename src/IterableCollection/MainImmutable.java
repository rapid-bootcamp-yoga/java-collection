package IterableCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainImmutable {
    public static void main(String[] args) {
        Person person = new Person("Aldi",
                Arrays.asList("Coding", "Design", "test"));

        System.out.println(person);
        //cara salah
        //person.getHobbies().add("gamming");

        //cara benar , diconvert dulu ke muttable datanya
        List<String> hobbies = new ArrayList<>(person.getHobbies());
        hobbies.add("Gamming");
        person.setHobbies(hobbies);
        System.out.println(person);
    }
}
