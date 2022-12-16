package SetCollection;

import model.GenderEnum;

import java.util.EnumSet;

import java.util.Set;
public class MainImmuttableSet {
    public static void main(String[] args) {
        Set<GenderEnum> gender = EnumSet.allOf(GenderEnum.class);
        System.out.println(gender);

        Set<String> immutSet = Set.of("Andika", "Sudirman", "Hatta");
        immutSet.remove("Andika");// error
        immutSet.add("Roni");
    }
}
