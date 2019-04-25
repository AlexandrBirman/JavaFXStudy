package sample.interfaces.implementations;

import sample.interfaces.AdressBook;
import sample.objects.Person;

import java.util.ArrayList;
import java.util.List;

public class CollectionAdressBook implements AdressBook{

    private List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

}
