package IterableCollection;

import java.util.List;

public class Person {
    private  int id;
    private String name;
    private String city;

    private List<String> hobbies;

    public Person(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;

    }

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
